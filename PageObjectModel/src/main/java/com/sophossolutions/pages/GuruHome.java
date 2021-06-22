package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject{
	
	By title = By.xpath("//tr[@class='heading3']/td[text()]");

	public void validateTitle(String titulo) {
		
		Action.validateText(getDriver(), title, titulo);
		
	}

}
