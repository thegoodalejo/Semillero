package com.guacha.pages;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guacha.actions.Actions;

import net.thucydides.core.pages.PageObject;

public class DespegarTickets extends PageObject{
	
	By airlineOptions = By.xpath("//airlines-matrix-airline/ul/li[1]//div[@class='airline-name']/span");
	By airlineReviews = By.xpath("//review-summary//a/div[1]/div[1]/span");
	String directPriceSelectorPattern = "(//li[contains(@class, 'priceItem')][1])[%d]//span[@class='amount price-amount']";
	String layoverSelectorPattern = "(//li[contains(@class, 'last') and contains(@class, 'priceItem')])[%d]//span[@class='amount price-amount']";
	
	public void waitForLoadTime() {
		Actions.waitForElement(getDriver(), airlineOptions);
	}
	
	public void printTickets() {
		List<WebElement> airlines = Actions.getElements(getDriver(), airlineOptions);
		List<WebElement> ratings = Actions.getElements(getDriver(), airlineReviews);
		List<WebElement> directPrices = new LinkedList<>();
		for (int i = 1; i <= airlines.size(); i++) {
			By direct = By.xpath(String.format(directPriceSelectorPattern, i));
			if (Actions.getElements(getDriver(), direct).size() > 0) {
				directPrices.add(Actions.getElements(getDriver(), direct).get(0));
			} else {
				directPrices.add(null);
			}
		}		
		
		List<WebElement> layoverPrices = new LinkedList<>();
		for (int i = 1; i <= airlines.size(); i++) {
			By layover = By.xpath(String.format(layoverSelectorPattern, i));
			if (Actions.getElements(getDriver(), layover).size() > 0) {
				layoverPrices.add(Actions.getElements(getDriver(), layover).get(0));
			} else {
				layoverPrices.add(null);
			}
		}
		
		for (int i = 0; i < airlines.size(); i++) {
			System.out.println("\n-------------------------------------------------------------------\n");
			WebElement airline = airlines.get(i);
			WebElement airlineRating = ratings.get(i);
			System.out.println(String.format("Aerolínea: %s (Calificación %s/10)", airline.getText(), airlineRating.getText()));
			int directCostValue = Integer.MAX_VALUE;
			if (directPrices.get(i) != null) {
				WebElement directCost = directPrices.get(i);
				directCostValue = Integer.parseInt(directCost.getText().replace(".", ""));
				System.out.println(String.format("Vuelo directo más barato: $%d", directCostValue));				
			} else {
				System.out.println("Actualmente, no hay vuelos directos que cumplan esos parámetros");
			}
			
			if (layoverPrices.get(i) != null) {
				int layoverCost = Integer.parseInt(layoverPrices.get(i).getText().replace(".", ""));	
				if (layoverCost < directCostValue) {
					System.out.println(String.format("Hay un vuelo con 1 escala con menor precio ($%d)", layoverCost));
				}
			}
			
		}
		System.out.println("\n-------------------------------------------------------------------\n");
		
		
	}

}
