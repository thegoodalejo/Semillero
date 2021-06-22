package com.sophossolutions.pages;


import com.sophossolutions.actions.Action;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
//@DefaultUrl("http://demo.guru99.com/V4/")
public class GuruLogin extends PageObject {
	By userName = By.xpath("//input[@name=\"uid\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By btnLogin = By.xpath("//input[@name=\"btnLogin\"]");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	
	public void login(String strUserName, String strPassword) {
		Action.login(getDriver(), userName, password, btnLogin, strUserName, strPassword);
	}
	
}