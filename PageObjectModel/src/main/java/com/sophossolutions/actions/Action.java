package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {

	public static void navegateToUrl(String url, WebDriver myBrowser) {
		myBrowser.navigate().to(url);
	}
	
	public static void login(WebDriver myBrowser, By userName, By password, String nombreU, String contrasena, By btnLogin){
		myBrowser.findElement(userName).sendKeys(nombreU);
		myBrowser.findElement(password).sendKeys(contrasena);
		myBrowser.findElement(btnLogin).click();
	}

	public static void validateText(WebDriver driver, By title, String titulo) {
		String tituloActual = driver.findElement(title).getText();
		assertEquals("El valor esperado: \"" + titulo + "\", es diferente a: \"" + tituloActual +"\"", titulo, tituloActual);
		
	}
}

