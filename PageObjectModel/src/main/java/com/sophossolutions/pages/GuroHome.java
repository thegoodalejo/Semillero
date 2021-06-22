package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuroHome extends PageObject{

	By texto = By.xpath("//tr[@class='heading3']//td[text()]");
	
	public void validartextop(String strtexto) {
		Action.validartext(getDriver(), texto, strtexto);
	}
}
