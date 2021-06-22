package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.thucydides.core.pages.PageObject;

public class GuroLogin extends PageObject {
	
	By userName = By.name("uid");
	By password = By.name("Password");
	By btnLoginxPath = By.xpath("//*[@type='submit']");
	
	public void navegateTo(String url) {
		Actions.navegateToUrl(getDriver(), url);
		
	}
	
}

