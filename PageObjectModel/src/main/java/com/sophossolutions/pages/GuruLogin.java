package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://demo.guru99.com/V4")
public class GuruLogin extends PageObject
{
	By user = By.name("uid");
	By pass = By.name("password");
	By btnLogin = By.name("btnLogin");
	//By btnLogin = By.xpath("//input[@value='LOGIN']");
	
	public void navegateTo(String url)
	{
		Action.navegateToUrl(getDriver(), url);
		
	}
	
	public void Login(String userText, String passText)
	{
		Action.login(getDriver(), user, pass, btnLogin, userText, passText);
	}
}
