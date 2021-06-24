package com.sophossolutions.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.despegar.com.co/")
public class FlightsPage extends PageObject {

	By airlineOptions = By.xpath("//airlines-matrix-airline/ul/li[1]//div[@class='airline-name']/span");
	String directSelectorPattern = "(//li[contains(@class, 'priceItem')][1])[%d]//span[@class='amount price-amount']";
	String layoverSelectorPattern = "(//li[contains(@class, 'last') and contains(@class, 'priceItem')])[%d]//span[@class='amount price-amount']";
	
	// Waits for an element to load
	public void waitForLoad() {
		Action.waitForElement(getDriver(), airlineOptions);
	}
	
	// Print lowest cost tickets per airline. Compares direct and layover tickets.
	public void printLowestCostTicketsPerAirline() {
		List<WebElement> airlines = Action.getElements(getDriver(), airlineOptions);
		List<WebElement> directPrices = new LinkedList<>(), layoverPrices = new LinkedList<>();
		
		// Fill lists with prices per airline
		for (int i = 1; i <= airlines.size(); i++) {
			// Fill layover tickets list with prices
			By layover = By.xpath(String.format(layoverSelectorPattern, i));
			if (Action.getElements(getDriver(), layover).size() > 0) {
				layoverPrices.add(Action.getElements(getDriver(), layover).get(0));
			} else {
				layoverPrices.add(null);
			}
			// Fill direct tickets list with prices
			By direct = By.xpath(String.format(directSelectorPattern, i));
			if (Action.getElements(getDriver(), direct).size() > 0) {
				directPrices.add(Action.getElements(getDriver(), direct).get(0));
			} else {
				directPrices.add(null);
			}
		}
		
		// Compare direct vs layover to determine lowest priced ticket per airline
		for (int i = 0; i < airlines.size(); i++) {
			WebElement airline = airlines.get(i);
			System.out.println(String.format("Aerolínea: %s", airline.getText()));
			
			int lowestPrice;
			if (directPrices.get(i) == null) { 
				lowestPrice = Integer.parseInt(layoverPrices.get(i).getText().replace(".", ""));	
			} else if (layoverPrices.get(i) == null) {
				lowestPrice = Integer.parseInt(directPrices.get(i).getText().replace(".", ""));
			} else {
				int layoverCost = Integer.parseInt(layoverPrices.get(i).getText().replace(".", ""));	
				int directCost = Integer.parseInt(directPrices.get(i).getText().replace(".", ""));
				lowestPrice = Math.min(layoverCost, directCost);
			}
			
			System.out.println(String.format("Vuelo más barato: $%d", lowestPrice));
		}
		
		
	}
}
