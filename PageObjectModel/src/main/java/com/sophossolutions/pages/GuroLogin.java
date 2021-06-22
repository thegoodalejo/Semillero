package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject; //getDriver()

//@DefaultUrl("http://demo.guru99.com/V4/")
//Esta sirve dependiendo del caso

public class GuroLogin extends PageObject {
	By userName=By.name("uid");
	By password=By.name("password");
	By btnlogin=By.xpath("//input[@name='btnLogin']");
	
	//usar el navegador como usario
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	
	public void login(String strUserName,String strPassword) {
		Action.login(getDriver(), userName, password, btnlogin, strUserName, strPassword);
	}
	
}
