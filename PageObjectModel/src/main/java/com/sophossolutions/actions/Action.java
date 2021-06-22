package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	
	public static void navigateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	public static void login(WebDriver myBrowser, By userName, By password, By btnLogin, String strUserName, String strPassword) {
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
		
	}
	public static void validateText(WebDriver myBrowser,By tittle, String strTittle) {
		String tituloActual = myBrowser.findElement(tittle).getText();
		assertEquals("el valor esperado: \""+strTittle+"\", es diferente a: \""+ tituloActual+ "\"",strTittle,tituloActual);
		//assertEquals("testo en caso de falla ",strTittle,tituloActual);
	}

}
