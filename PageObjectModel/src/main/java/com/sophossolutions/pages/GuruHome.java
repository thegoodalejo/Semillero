package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject {

	By titulo = By.xpath("//tr[@class='heading3']//td");
	
	public void validarTitle(String strTitle) {		//viene de stepDefinitions
		Action.validateText(getDriver(), titulo, strTitle);
	}	
}
