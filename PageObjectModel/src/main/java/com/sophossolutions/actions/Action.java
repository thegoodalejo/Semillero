package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

public class Action
{
	public static void navegateToUrl(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}
}