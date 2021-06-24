package com.sophossolutions.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.despegar.com.co/")
public class DespegarMain extends PageObject {

	By originField = By.xpath("(//input[@type='text'])[1]");
	By destinationField = By.xpath("(//input[@type='text'])[2]");
	By firstResultOfList = By.xpath("//li[contains(@class, '-active')]");
	
	By dateSelector = By.xpath("(//input[@placeholder='Ida'])[1]");
	
	By calendar = By.xpath("(//div[@data-month])[1]");
	By calendarDays = By.xpath("(//div[@data-month])/div[contains(@class, 'dates')]/div");
	By calendarNavigateLeftButton = By.xpath("(//a[@class='calendar-arrow-left'])[1]");
	By calendarNavigateRightButton = By.xpath("(//a[@class='calendar-arrow-right'])[1]");
	By calendarSubmit = By.xpath("//div[contains(@class, 'calendar-footer')]/div/button[not(contains(@class, '-disable'))]");
	
	By peopleSelector = By.xpath("(//input[@placeholder=''])[1]");
	By peopleSelectorSubmitButton = By.xpath("//div[@class='stepper__room__footer ']/a");
	By increaseAdultsButton = By.xpath(String.format("//div[@class='stepper__room__row'][%d]/div/div/button[2]", 1));
	By increaseChildrenButton = By.xpath(String.format("//div[@class='stepper__room__row'][%d]/div/div/button[2]", 2));
	String ageSelectors = "(//div[@class='stepper__room__row']//select)[%d]";
	
	By submitAllButton = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button/em");
	
	
	// Open new browser window
	public void openBrowser() {
		open();
	}
	
	// Enter origin city onto text field, then choose first result from list
	public void inputOriginCity(String city) {
		Action.typeIntoField(getDriver(), this.originField, city);
		Action.clickElement(getDriver(), this.firstResultOfList);
	}
	
	// Enter city onto text field, then choose selection from list
	public void inputDestinationCity(String city) {
		Action.typeIntoField(getDriver(), this.destinationField, city);
		Action.clickElement(getDriver(), this.firstResultOfList);
	}
	
	// Open calendar from website
	public void openCalendar() {
		Action.clickElement(getDriver(), dateSelector);
		Action.waitForElement(getDriver(), calendarNavigateRightButton);
	}
	
	public void calendarNavigateLeft() {
		Action.clickElement(getDriver(), calendarNavigateLeftButton);
	}

	public void calendarNavigateRight() {
		Action.clickElement(getDriver(), calendarNavigateRightButton);
	}

	// Enter tester-defined dates onto website date selector
	public void inputDates(String departureDate, String returnDate) {
		// Split date by slashes. 0: Day, 1: Month, 2: Year
		String[] departureSplit = departureDate.split("/");
		String[] returnSplit = returnDate.split("/");
		
		// Open calendar
		openCalendar();
		
		// Check if month and year appear on the first calendar that pops up. 0: Year, 1: Month
		String[] calendarDate = Action.getAttributeOfElement(getDriver(), calendar, "data-month").split("-");

		// First for loop iteration compares years, second compares months
		int j = 2;
		for (int i = 0; i <= 1; i++) {
			// While test year is greater than year of calendar
			while (Integer.parseInt(departureSplit[j]) > Integer.parseInt(calendarDate[i])) {
				calendarNavigateRight();
				calendarDate = Action.getAttributeOfElement(getDriver(), calendar, "data-month").split("-");
			}
			// Opposite procedure. While test year is lesser than year of calendar
			while (Integer.parseInt(departureSplit[j]) < Integer.parseInt(calendarDate[i])) {
				calendarNavigateLeft();
				calendarDate = Action.getAttributeOfElement(getDriver(), calendar, "data-month").split("-");
			}
			j--;
		}
		
		// List of all day buttons
		List<WebElement> dayButtons = Action.getElements(getDriver(), calendarDays);
		
		// Traverse WebElements in list of day buttons in order to find test destination day
		int dayCounter = 0;
		while(dayCounter < dayButtons.size()) {
			WebElement dayDepButton = dayButtons.get(dayCounter);
			// Compare if calendar day equals test day
			if (dayDepButton.getText().equals(departureSplit[0])) {
				Action.clickElement(getDriver(), dayDepButton);
				dayCounter++;
				break;
			}
			dayCounter++;
		}
		
		// Navigate to the right if test return month is not the same as test departure month
		if (Integer.parseInt(returnSplit[1]) > Integer.parseInt(calendarDate[1])) {
			// Reset day button counter
			dayCounter = 0;
			while (Integer.parseInt(returnSplit[1]) > Integer.parseInt(calendarDate[1])) {
				calendarNavigateRight();
				calendarDate = Action.getAttributeOfElement(getDriver(), calendar, "data-month").split("-");
			}
		}

		// Select test return date
		while(j < dayButtons.size()) {
			WebElement dayRetButton = dayButtons.get(j);
			// Compare if calendar day equals test day
			if (dayRetButton.getText().equals(returnSplit[0])) {
				Action.clickElement(getDriver(), dayRetButton);
				break;
			}
			j++;
		}
		
		// Submit form
		Action.clickElement(getDriver(), calendarSubmit);
	}
	
	public void inputFlyers(int adults, int children, List<Integer> childrenAges) {
		// Obtain increment people buttons
		Action.clickElement(getDriver(), peopleSelector);
		
		// Wait for increment adult passengers button to show up
		Action.waitForElement(getDriver(), increaseAdultsButton);
		
		// Add adults using increment adult passengers button as many times as needed
		for (int i = 1; i < adults; i++) {
			Action.clickElement(getDriver(), increaseAdultsButton);			
		}
		// Add children using increment children passengers button as many times as needed
		for (int i = 0; i < children; i++) {
			Action.clickElement(getDriver(), increaseChildrenButton);			
		}
		
		// Select age of each child
		for (int i = 0; i < children; i++) {
			int age = childrenAges.get(i);
			By ageSelector = By.xpath(String.format(ageSelectors, i + 1));
			Action.typeIntoField(getDriver(), ageSelector, String.valueOf(age));
		}
		Action.clickElement(getDriver(), peopleSelectorSubmitButton);
	}
	
	public void submitEverything() {
		Action.clickElement(getDriver(), submitAllButton);
	}
	
}