package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Actions {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	public static void login(WebDriver myBrowser,
			By userName, By password, By btnlogin,
			String strUserName, String strPassword) 
	{
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnlogin).click();
	}
	 public static void validateText(WebDriver driver, By title, String strTitle) {
	
		 String tituloActual = driver.findElement(title).getText();
		 assertEquals(
				 "El valor esperado:	\"" + strTitle + "\", es diferente a : \"" + tituloActual + "\"", strTitle, tituloActual);
		// assertEquals( "titulo en caso de fallo : ", strTitle, tituloActual);
	}
}
