package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuroLogin extends PageObject {

	By userName = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.name("btnLogin");
	//By btnLoginxPath = By.xpath("aca el xpath");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
}
