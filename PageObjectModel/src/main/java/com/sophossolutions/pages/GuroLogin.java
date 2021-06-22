package com.sophossolutions.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

//@DafaulttUrl()
public class GuroLogin extends PageObject{

	By userName = By.name("uid");
	By password = By.name("password");
	By btnLogin = By.xpath("//input[@type='submit']");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(url, getDriver());
		
	}
	
	public void login(String nombreU, String contrasena){
		Action.login(getDriver(), userName, password, nombreU, contrasena, btnLogin);
	}
	
	
	
}
