package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	 
	//Navegar a las vistas de la pagina
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		 myBrowser.navigate().to(url);
	 }
	
	//Inicio de sesión
	public static void Login(WebDriver myBrowser, 
			By userName, By password, By btnLogin,
			String strUserName, String strPassword) {
		
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
	}
	
	//Validar texto	
	public static void validateText(WebDriver driver, 
		 By title, 
		 String strTittle ) {
		 
		String tituloActual = driver.findElement(title).getText();
		assertEquals("El valor esperado: \""+strTittle+"\", es diferente a: \""+tituloActual+"\"\"", 
				strTittle,
				tituloActual);
		 
	}

	public static void buscar(WebDriver myBrowser, By busqueda, String producto) {
		myBrowser.findElement(busqueda).sendKeys("escritorio");
		
	}

}
