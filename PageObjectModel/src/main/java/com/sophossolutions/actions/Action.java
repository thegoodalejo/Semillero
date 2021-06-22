package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	public static void login(
			WebDriver myBrowser,
			By userName, By password, By btnLogin,
			String strUserName, String strPassword) {
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
	}

	public static void validateText(WebDriver driver, By txtHome, String strTextHome) {
		String txtActual = driver.findElement(txtHome).getText();
		assertEquals("El valor esperado es \"" + strTextHome + 
				     "\" es diferente al texto actual: \"" + txtActual +"\"",
				     strTextHome, txtActual);
	}
	
}
