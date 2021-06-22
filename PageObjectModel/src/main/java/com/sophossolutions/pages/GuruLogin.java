package com.sophossolutions.pages;


import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruLogin extends PageObject{

	By username = By.name("uid");
	By password = By.name("password");
	By loginBtn = By.xpath("//input[@type='submit']");
	
	public void navigateTo(String url) {
		Action.navigateToUrl(getDriver(), url);
	}
	
	public void login(String usr, String psw) {
		Action.typeIntoField(getDriver(), username, usr);
		Action.typeIntoField(getDriver(), password, psw);
		Action.clickElement(getDriver(), loginBtn);
	}
	
	
}
