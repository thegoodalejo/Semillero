package com.sophossolutions.pages;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/v4")
public class GuroLogin extends PageObject {
	
	By userName = By.name("uid");
	By password = By.name("password");
	By btnlogin = By.xpath("//input[@name='btnLogin']");
	
	public void navegateTo(String url) {		
		Action.navegateToUrl(getDriver(), url);		
	}
	
	public void login(String strUserName, String strPassword) {
		Action.login(getDriver(), btnlogin, userName, password, strUserName, strPassword);
	}
	
}
