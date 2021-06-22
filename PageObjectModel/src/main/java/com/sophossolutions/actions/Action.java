package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//interactuar con el navegador 

public class Action {
	//preferiblemente definidos de forma generica
	public static void navegateToUrl(WebDriver myBrowser,String url) {
		myBrowser.navigate().to(url);
	}
	public static void login(WebDriver myBrowser,By userName,By password,By btnLogin,String strUserName,String strPassword) {
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();;
		
	}
	public static void validateText(WebDriver driver, By title,String strTitle) {
		String tituloActual=driver.findElement(title).getText();
		assertEquals("Texto en caso de falla ",strTitle,tituloActual);
		
	}

}
