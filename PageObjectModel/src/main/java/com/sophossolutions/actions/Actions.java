package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

public class Actions {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

}
