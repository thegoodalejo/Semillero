package com.sophossolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AmazonSearchPage extends PageObject {
	
	String searchResult1 = "(//div[@data-cel-widget and @data-index and not(contains(@class, 'AdHolder'))]//div[contains(@class,'sg-col-12-of-20')])[3]";
	String searchResult2 = "(//div[@data-cel-widget and @data-index and not(contains(@class, 'AdHolder'))]//div[contains(@class,'sg-col-12-of-20')])[7]";
	String searchResult3 = "(//div[@data-cel-widget and @data-index and not(contains(@class, 'AdHolder'))]//div[contains(@class,'sg-col-12-of-20')])[12]";
	
	private String getTitle(String selector) {
		By title = By.xpath(selector + "//h2//span");
		return Action.getElementText(getDriver(), title);
	}
	
	private String getPrice(String selector) {
		By whole = By.xpath(selector + "//span[contains(@class, 'a-price-whole')][1]");
		By frac = By.xpath(selector + "//span[contains(@class, 'a-price-fraction')][1]");
		return "$" + Action.getElementText(getDriver(), whole) + "." + Action.getElementText(getDriver(), frac);
	}
	
	private void printSearchResult(String searchResult) {
		System.out.println("-----------------------------------------------------------\n" + getTitle(searchResult));
		String price = getPrice(searchResult);
		if (!price.equals("$no.no")) {
			System.out.println("El elemento tiene precio " + price);
		} else {
			System.out.println("El elemento no tiene precio disponible");
		}
	}
	
	// print all search results
	public void printResults() {
		printSearchResult(searchResult1);
		printSearchResult(searchResult2);
		printSearchResult(searchResult3);
	}

}
