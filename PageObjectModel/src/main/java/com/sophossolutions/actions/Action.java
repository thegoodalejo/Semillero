package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {

	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static int countElements(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0)
			return myBrowser.findElements(target).size();
		return 0;
	}

	public static void sendData(WebDriver myBrowser, By target, String strData) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).sendKeys(strData);
		}
	}

	public static void clickElement(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).click();
		}
	}
	
	public static void getElementText(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).getText();
		}else {
			System.out.println("Missing element: " + target.toString());
		}
	}

	public static void validateText(WebDriver myBrowser, By target, String strTitle) {
		if (myBrowser.findElements(target).size() > 0) {
			String tituloActual = myBrowser.findElement(target).getText();
			assertEquals("El valor esperado: \"" + strTitle + "\", es diferente a: \"" + tituloActual + "\"", strTitle,
					tituloActual);
		}

	}

}
