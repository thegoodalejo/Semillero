package com.despegar.pages;


import org.openqa.selenium.By;
import com.despegar.actions.Action;
import net.serenitybdd.core.pages.PageObject;

public class DespegarHome extends PageObject {
	
	boolean isValidPassenger = false;
	
	String txtBtnSelectClass = "//div[@class='sbox5-cabin-class--1ReWi']//select[@class='select-tag']";
	String txtBtnSelectEdad = "//select[@class='select']";
	String txtDateFormat = "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-component='datepicker']//div[@class='sbox5-monthgrid-datenumber'][%s]";
	String txtMenuBtnsPassengers = "//div[@class='stepper__room__row'][%s]";
	String txtOptionClass = "//option[contains(text(),'%s')]";
	String txtPathItemCity = "//ul[@class='ac-group-items']//li[1]//span";
	String txtSelectButton = "//button[@class='steppers-icon-%s stepper__icon']";
	String txtSelectEdad = "//option[@value='%s']";
	
	By btnCalendarEnd = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Vuelta']");
	By btnCalendarIni = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Ida']");
	By btnConfirmPassengers = By.xpath("//div[@class='stepper__room__footer ']//em[@class='btn-text']");
	By btnSearch = By.xpath("//button[.//em[text()=\"Buscar\"]]");
	By editTextFrom = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Ingresa desde dónde viajas']");
	By editTextTo = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//div[@class='sbox-places-destination--1xd0k sbox-places-origin-destination--1I6U9 show-dotted-line--1lOfj']//input");
	By selectPassenger = By.xpath("//div[@class='sbox5-segment--2_IQ3']//div[@class='sbox5-distribution-passengers--dbiHH']//input[@type='text']");
	
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}

	public void writeFromCity(String strFromCity) {
		Action.writeEditText(getDriver() ,editTextFrom, strFromCity);
		Action.clickInObject(getDriver(), By.xpath(txtPathItemCity));
	}

	public void writeToCity(String strToCity) {
		Action.writeEditText(getDriver(), editTextTo, strToCity);
		Action.clickInObject(getDriver(), By.xpath(txtPathItemCity));
	}

	public void searchTravel() {
		Action.clickInObject(getDriver(), btnSearch);
	}

	public void writeDateIni() {
		Action.clickInObject(getDriver(), btnCalendarIni);
		By calendarDays = By.xpath( String.format(txtDateFormat,"1"));
		Action.waitForElement(getDriver(), calendarDays, 10);
		Action.clickInObject(getDriver(),  calendarDays);
	}

	public void writeDateEnd() {
		Action.clickInObject(getDriver(), btnCalendarEnd);
		By calendarDays = By.xpath( String.format(txtDateFormat,"5"));
		Action.waitForElement(getDriver(), calendarDays, 10);
		Action.clickInObject(getDriver(),  calendarDays);
	}

	public void selectPassengers(int numAdults, int numChilds, String listAges) {
		Action.clickInObject(getDriver(), selectPassenger);
		Action.clickInObject(getDriver(), selectPassenger);
		Action.waitForElement(getDriver(), selectPassenger, 1);
		String[] boysAges = listAges.split(",");		
		if( boysAges.length == numChilds ) {
			if (numAdults < 1) numAdults = 1;
			else numAdults--;
			this.addPerson(numAdults, "1");			
			this.addPerson(numChilds, "2");
			this.addAges(boysAges);
			this.isValidPassenger = true;
		}
	}
	
	public void addPerson(int numPerson, String type) {
		for (int i = 1; i <= numPerson; i++) {
			String txtMenuBtnAux = String.format(txtMenuBtnsPassengers, type) + String.format(txtSelectButton, "right");
			Action.clickInObject(getDriver(), By.xpath(txtMenuBtnAux) );
		}
	}
	private void addAges(String[] listChildsAges) {
		for (int i = 0; i < listChildsAges.length; i++) {
			int edad = Integer.parseInt(listChildsAges[i]);
			String txtBtnSelectAux = String.format(txtMenuBtnsPassengers,  Integer.toString(i+3) ) + txtBtnSelectEdad;
			Action.clickInObject(getDriver(), By.xpath(txtBtnSelectAux));
			Action.clickInObject(getDriver(), By.xpath(txtBtnSelectAux + String.format(txtSelectEdad, edad)));
		}	
	}

	public void selectClassToFlight(String typeClass) {
		if (this.isValidPassenger) {
			By btnSelectClass = By.xpath(txtBtnSelectClass);
			By selectedClass = By.xpath(txtBtnSelectClass + String.format(txtOptionClass, typeClass) );
			Action.clickInObject(getDriver(), btnSelectClass);
			Action.waitForElement(getDriver(), btnSelectClass, 1);
			Action.clickInObject(getDriver(), selectedClass);
			Action.clickInObject(getDriver(), btnConfirmPassengers);
		}
	}

}