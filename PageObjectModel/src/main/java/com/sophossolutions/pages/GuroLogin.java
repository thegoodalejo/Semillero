package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuroLogin extends PageObject{

	 By userId = By.name("uid");
	 By password = By.name("password");
	 By btnLogin = By.xpath("//input[@type='submit']");
	 By btnReset = By.xpath("//input[@type='reset']");
	 
	 //Navegación a la pagina
	 public void navegateToUrl(String url) {
		 Action.navegateToUrl(getDriver(), url); 
	 }	 
	 
}
