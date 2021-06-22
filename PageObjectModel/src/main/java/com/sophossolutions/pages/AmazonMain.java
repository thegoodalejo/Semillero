package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AmazonMain extends PageObject{

	By searchBar = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");
	
	public void navigateTo(String url) {
		Action.navigateToUrl(getDriver(), url);
	}
	
	public void search(String search) {
		Action.typeIntoField(getDriver(), searchBar, search);
		Action.clickElement(getDriver(), searchButton);
	}
	
}
