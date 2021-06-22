package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action
{
	public static void navegateToUrl(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}
	
	public static void login(WebDriver driver, By user, By pass, By btnLogin, String userText, String passText)
	{
		driver.findElement(user).sendKeys(userText);
		driver.findElement(pass).sendKeys(passText);
		driver.findElement(btnLogin).click();
	}
	
	public static void validarTitulo(WebDriver driver, By text, String strText)
	{	
		String textActual = driver.findElement(text).getText();
		assertEquals("El valor esperado: \"" + strText + "\", es diferente a: \"" + textActual + "\"", strText, textActual);
	}
}