package com.sophossolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.sophossolutions.actions.Action.*;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://demo.guru99.com/V4/")
public class GuroLogin extends PageObject {

	By userName = By.name("uid");
	By password = By.name("password");
	By passwordBAD = By.name("passwordaawd");
	By btnLogin = By.name("btnLogin");

	public void navegateTo(String url) {
		navegateToUrl(getDriver(), url);
	}
	
	public void login(String strUserName, String strPassword) {
		sendData(getDriver(), userName, strUserName);
		sendData(getDriver(), password, strPassword);
		sendData(getDriver(), passwordBAD, strPassword);
		clickElement(getDriver(), btnLogin);	
		
	}
	
}
