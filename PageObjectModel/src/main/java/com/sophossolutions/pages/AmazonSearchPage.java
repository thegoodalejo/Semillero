package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AmazonSearchPage extends PageObject {
	
	public By searchResults = By.xpath("//div[@data-cel-widget and @data-index and not(contains(@class, 'AdHolder'))]//div[contains(@class,'sg-col-12-of-20')]");

}
