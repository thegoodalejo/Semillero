package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsDespegar {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

		
	public static void buscar(WebDriver driver, By barraOrigen, By barraDestino, String strOrigen, String strDestino, By seleccionar) {
		
		driver.findElement(barraOrigen).click();
		driver.findElement(barraOrigen).sendKeys(strOrigen);
		driver.findElement(seleccionar).click();
		
		driver.findElement(barraDestino).click();
		driver.findElement(barraDestino).sendKeys(strDestino);
		driver.findElement(seleccionar).click();

		
	}


	public static void fecha(WebDriver driver, By btnfechaIda, By btnfechaRegreso, By btnfechaInicial, By btnAplicar, By btnfechaVuelta) {
		
		
		driver.findElement(btnfechaIda).click();
		driver.findElement(btnfechaIda).click();
		driver.findElement(btnfechaInicial).click();
		driver.findElement(btnfechaVuelta).click();
	//	driver.manage().
		//driver.findElement(btnfechaVuelta).click();
		//driver.findElement(btnfechaRegreso).click();
		//driver.findElement(btnfechaVuelta).click();
		driver.findElement(btnAplicar).click();
		

	}
	

}
