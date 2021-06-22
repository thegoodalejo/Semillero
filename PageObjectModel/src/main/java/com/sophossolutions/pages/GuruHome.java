package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruHome extends PageObject {
	
	By title =By.xpath("//td[@style=\'color: green\']") ;
	
	public void validateTitle(String strTitle) {
		Action.validateText(getDriver(),title,strTitle);
	}

}
