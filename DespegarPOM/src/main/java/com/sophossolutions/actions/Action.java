package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {

	public static void navigateToUrl(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public static void clickElemento(WebDriver driver, By element) {
		driver.findElement(element).click();
	}

	public static void escribirTexto(WebDriver driver, By element, String str) {
		driver.findElement(element).sendKeys(str);
		
	}
	
	public static String obtenerTextoDeElemento(WebDriver driver, By element) {
		boolean test = driver.findElements(element).size() > 0;
		if (test) 
			return driver.findElement(element).getText();
		return "";
	}

}
