package com.sophossolutions.pages;

import org.openqa.selenium.By;
import com.sophossolutions.Actions.Actions;
import net.serenitybdd.core.pages.PageObject;

public class GitHubHome extends PageObject {
	
	By editTextSearch = By.xpath("//div[@class='d-lg-flex min-width-0 mb-3 mb-lg-0']//input[@type!='hidden']");
	By selectOptionsSearch = By.xpath("//ul[@id='jump-to-results']//li[contains(@id,'search-global')]");
	
	public void navigateTo(String url) {
		Actions.navegateToUrl(getDriver(), url);
	}

	public void iniSearch(String txtRepoName) {
		Actions.writeEditText(getDriver(), editTextSearch, txtRepoName);
		Actions.waitForElement(getDriver(), selectOptionsSearch, 5);
		Actions.clickInObject(getDriver(), selectOptionsSearch);
	}

}
