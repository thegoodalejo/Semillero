package com.sophossolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://demo.guru99.com/v4/")
public class GuruLogin extends PageObject{
	
	By userName = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.xpath("//input[@type='submit']");

	public void navegateTo(String url) {
		Action.navigateToUrl(getDriver(), url);
	}
	
	public void login(String strUserName, String StrPassword) {
		Action.login(getDriver(), userName, password, btnLogin, strUserName, StrPassword);
	}
}
