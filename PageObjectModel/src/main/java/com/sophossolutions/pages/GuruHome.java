package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruHome extends PageObject {

	By title = By.xpath("//tr[@class='heading3']/td[text()]");
	
	String titlezzz = "//*[text()='%s']";
    By title2;
	
	public void validateTitle(String strTitle) {
		title2 = By.xpath(String.format(titlezzz, strTitle));
		Action.validateText(getDriver(),title,strTitle);
	}
}
