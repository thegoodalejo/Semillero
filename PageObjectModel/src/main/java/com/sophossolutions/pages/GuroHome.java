package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuroHome extends PageObject {

	By tittle = By.xpath("//tr[@class]/td");
	
	 //Validate Text
	 public void validateText(String strTitle ) {
		 Action.validateText(getDriver(), tittle, strTitle);
	 }
}
