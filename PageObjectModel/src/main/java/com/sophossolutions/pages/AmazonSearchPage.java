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
	
	public void printResults() {
		System.out.println("-----------------------------------------------------------");
		System.out.println(getTitle(searchResult1));
		String price = getPrice(searchResult1);
		if (!price.equals("$no.no")) {
			System.out.println("El elemento tiene precio " + price);
		} else {
			System.out.println("El elemento no tiene precio disponible");
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println(getTitle(searchResult2));
		price = getPrice(searchResult2);
		if (!price.equals("$no.no")) {
			System.out.println("El elemento tiene precio " + price);
		}else {
			System.out.println("El elemento no tiene precio disponible");
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println(getTitle(searchResult3));
		price = getPrice(searchResult3);
		if (!price.equals("$no.no")) {
			System.out.println("El elemento tiene precio " + price);
		}else {
			System.out.println("El elemento no tiene precio disponible");
		}
	}

}
