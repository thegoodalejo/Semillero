package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);; //nos recibe la url
	}
	
	public static void login(WebDriver myBrowser, By btnLogin, By userName, By password, String strUserName, String strPassword) {
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
	}
	
	public static void validateText(WebDriver myBrowser, By title, String strTitle){
		String titleRecibido = myBrowser.findElement(title).getText(); //lo trae del explorador
		
		//validaciones
		assertEquals("El valor esperado: \"" + strTitle + "\", es diferente a: \"" + titleRecibido,strTitle,titleRecibido);
//		assertEquals("Texto en caso de falla", strTitle, titleRecibido);
	}

}
