package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

public class Action {

	public static void navigateToUrl(WebDriver browser, String url) {
		browser.navigate().to(url);
	}
	
}
