package com.sophossolutions.pages;


import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuroLogin extends PageObject{

	By userName = By.name("uid");
	By password = By.name("password");
	By btnLoginXpath = By.xpath("//input[@type='sumit']");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(url, getDriver());
		
	}
	
}
