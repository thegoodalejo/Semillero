package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

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
}
