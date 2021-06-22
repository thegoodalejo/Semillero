package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.thucydides.core.pages.PageObject;

//@DefaultURL("http://demo.guru99.com/V4/");
public class GuroLogin extends PageObject {
	
	By userName = By.name("uid");
	By password = By.name("password");
	By btnLoginxPath = By.xpath("//*[@type='submit']");
	
	public void navegateTo(String url) {
		Actions.navegateToUrl(getDriver(), url);
		
	}
	public void login(String strUserName, String strPassword) {
		Actions.login(getDriver(), userName, password, btnLoginxPath, strUserName, strPassword);
	}
	
}

