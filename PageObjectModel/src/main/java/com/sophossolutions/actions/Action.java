package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

//interactuar con el navegador 

public class Action {
	public static void navegateToUrl(WebDriver myBrowser,String url) {
		myBrowser.navigate().to(url);
		
	}

}
