package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

public class Action {

	public static void navegateToUrl(String url, WebDriver myBrowser) {
		myBrowser.navigate().to(url);
	}

	}

