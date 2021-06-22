package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;
import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject {
	By txtHome = By.xpath("//table//td[@style='color: green']");
	
	public void validateText(String strTextHome) {
		Action.validateText(getDriver(), txtHome, strTextHome);
	}
}
