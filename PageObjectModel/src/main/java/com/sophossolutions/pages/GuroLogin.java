package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuroLogin extends PageObject {

	By userName = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.xpath("//input[@value='LOGIN']");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	
	public void Login(String strname, String strpass) {
		Action.login(getDriver(),userName,password,btnLogin,strname,strpass);
	}
}
