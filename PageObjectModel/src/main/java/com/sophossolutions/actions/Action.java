package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Action {

	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	
	
	public static void IngresarProduc(WebDriver myBrowser,By text, By btn,By btncerrar ,String strtext) {
		myBrowser.findElement(btncerrar).click();
		myBrowser.findElement(text).sendKeys(strtext);
		myBrowser.findElement(btn).click();
		
	}
	
	public static void MostrarArticulos(WebDriver myBrowser,By Nombre1, By precio1) {
		/*
		if( myBrowser.findElements(Nombre1).Size() > 0 && myBrowser.findElement(precio1).getSize()) {
			
		}*/
		String Nombrestr1 =  myBrowser.findElement(Nombre1).getText();
		String preciostr1 =  myBrowser.findElement(precio1).getText();
		
		System.out.println("Nombre del articulo: " + Nombrestr1 + " ---- Precio: " + preciostr1);
		
	}
	
}
