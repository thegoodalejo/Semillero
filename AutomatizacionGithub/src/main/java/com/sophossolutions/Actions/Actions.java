package com.sophossolutions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void writeEditText(WebDriver myBrowser, By editText, String strEditText) {
		myBrowser.findElement(editText).click();
		myBrowser.findElement(editText).sendKeys(strEditText);
	}

	public static void clickInObject(WebDriver myBrowser, By objectToclick) {
		myBrowser.findElement(objectToclick).click();
	}

	public static void scrollDown(WebDriver myBrowser) {
		JavascriptExecutor js = (JavascriptExecutor) myBrowser;
		float delta = 1F;
		for(float i = delta; i <= 100; i += delta) {
			js.executeScript("window.scrollTo("+(i-delta)/100.0 +"*document.body.scrollHeight, "+i/100.0+"*document.body.scrollHeight);");
		}
	}

	public static void waitForElement(WebDriver myBrowser, By objectWait, int seconds) {
		WebDriverWait waitElem = new WebDriverWait(myBrowser,seconds);
		waitElem.until(ExpectedConditions.visibilityOfElementLocated(objectWait));
	}
}
