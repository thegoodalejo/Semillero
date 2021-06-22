package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruLogin extends PageObject
{
	By userName = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.name("btnLogin");
	
	public void navegateTo(String url)
	{
		Action.navegateToUrl(getDriver(), url);
		
	}
}
