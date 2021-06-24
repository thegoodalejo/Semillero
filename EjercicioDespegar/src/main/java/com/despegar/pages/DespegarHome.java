package com.despegar.pages;


import org.openqa.selenium.By;
import com.despegar.actions.Action;
import net.serenitybdd.core.pages.PageObject;

public class DespegarHome extends PageObject {
	
	
	String txtPathItemCity = "//ul[@class='ac-group-items']//li[1]//span";
	String dateFormat = "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-component='datepicker']//div[@class='sbox5-monthgrid-datenumber'][%s]";
	String menuBtnsPassengers = "//div[@class='stepper__room__row'][%s]";
	String selectButton = "//button[@class='steppers-icon-%s stepper__icon']";
	String selectEdad = "//select[@class='select']//option[@value='%s']";
	
	By editTextFrom = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Ingresa desde dónde viajas']");
	By editTextTo = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//div[@class='sbox-places-destination--1xd0k sbox-places-origin-destination--1I6U9 show-dotted-line--1lOfj']//input");
	By btnSearch = By.xpath("//button[.//em[text()=\"Buscar\"]]");
	By calendarIni = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Ida']");
	By calendarEnd = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[@placeholder='Vuelta']");
	By selectPassenger = By.xpath("//div[@class='sbox5-segment--2_IQ3']//div[@class='sbox5-distribution-passengers--dbiHH']//input[@type='text']");
	By btnConfirmPassengers = By.xpath("//div[@class='stepper__room__footer ']//em");
	
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
		Action.clickInObject(getDriver(), calendarIni);
		Action.clickInObject(getDriver(), calendarEnd);
		Action.clickInObject(getDriver(), calendarIni);
		Action.clickInObject(getDriver(), By.xpath( String.format(dateFormat,"1")) );
	}

	public void writeDateEnd() {
		Action.clickInObject(getDriver(), calendarEnd);
		Action.clickInObject(getDriver(), calendarIni);
		Action.clickInObject(getDriver(), calendarEnd);
		Action.clickInObject(getDriver(), By.xpath( String.format(dateFormat,"8")) );
		
	}

	public void selectPassengers(int numAdults, int numChilds) {
		Action.clickInObject(getDriver(), selectPassenger);
		Action.clickInObject(getDriver(), selectPassenger);
		if (numAdults <= 0) numAdults = 1;
		for (int i = 1; i < numAdults; i++) {
			Action.clickInObject(getDriver(), By.xpath(
					String.format(menuBtnsPassengers, "1") +
					String.format(selectButton, "right")
			));
		}
		for (int i = 1; i <= numChilds; i++) {
			Action.clickInObject(getDriver(), By.xpath(
					String.format(menuBtnsPassengers, "2") +
					String.format(selectButton, "right")
			));
			Action.clickInObject(getDriver(), By.xpath(
					String.format(menuBtnsPassengers, Integer.toString(i+2)) +
					String.format(selectEdad, Integer.toString(i))
		    ));
		}
		Action.clickInObject(getDriver(), btnConfirmPassengers);
		
	}

}
