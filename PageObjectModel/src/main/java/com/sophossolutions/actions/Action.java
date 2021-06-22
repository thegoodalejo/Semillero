package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {

	public static void navigateToUrl(WebDriver browser, String url) {
		browser.navigate().to(url);
	}

	public static void typeIntoField(WebDriver browser, By field, String str) {
		browser.findElement(field).sendKeys(str);
	}
	
	public static void clickElement(WebDriver browser, By element) {
		browser.findElement(element).click();
	}
	
	public static String getElementText(WebDriver browser, By element) {
		String elementText = browser.findElement(element).getText();
		return elementText;
	}
	
}
