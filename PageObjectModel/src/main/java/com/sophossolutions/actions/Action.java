package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Action {

	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	public static void login(WebDriver myBrowser,By UserName,By password,By btn,String strName,String strpassword) {
		
		myBrowser.findElement(UserName).sendKeys(strName);
		myBrowser.findElement(password).sendKeys(strpassword);
		myBrowser.findElement(btn).click();
	}
	
	public static void validartext(WebDriver myBrowser,By text,String strtext) {
		String textActual =  myBrowser.findElement(text).getText();
		
		assertEquals("El valor esperado: " + strtext + " es diferente a: " + textActual,strtext, textActual);
	}
	
}
