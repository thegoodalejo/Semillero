package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.thucydides.core.pages.PageObject;

public class GuruHome extends PageObject{
	
	By title = By.xpath("//tr[@class='heading3']/td[text()]");
	
	public void validateTitle(String strTitle){
		
		Actions.validateText(getDriver(), title, strTitle);		
	}

}
