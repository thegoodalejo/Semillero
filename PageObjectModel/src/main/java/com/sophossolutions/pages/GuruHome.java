package com.sophossolutions.pages;

import org.openqa.selenium.By;
<<<<<<< HEAD

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruHome extends PageObject {

	By title = By.xpath("//tr[@class='heading3']/td[text()]");
	
	String titlezzz = "//*[text()='%s']";
    By title2;
	
	public void validateTitle(String strTitle) {
		title2 = By.xpath(String.format(titlezzz, strTitle));
		Action.validateText(getDriver(),title,strTitle);
=======
import com.sophossolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject {
	By txtHome = By.xpath("//table//td[@style='color: green']");
	
	public void validateText(String strTextHome) {
		Action.validateText(getDriver(), txtHome, strTextHome);
>>>>>>> 34ed9efcb134bafe357379acd9dc79b6c082ec90
	}
}
