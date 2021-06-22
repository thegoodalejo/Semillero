package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

public class Action {
	
	public static void navigateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

}
