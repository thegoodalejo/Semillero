package com.sophossolutions.actions;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class Action {

	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	
	
	public static void IngresarProduc(WebDriver myBrowser,By text, By btn ,String strtext) {
		myBrowser.findElement(text).sendKeys(strtext);
		myBrowser.findElement(btn).click();
		
	}
	
	public static void MostrarArticulos(WebDriver myBrowser,By Nombre, By precio) {
		
		String Nombrestr =  myBrowser.findElement(Nombre).getText();
		String preciostr =  myBrowser.findElement(precio).getText();
		
		System.out.println("Nombre del articulo: " + Nombrestr + " Precio: " + preciostr);
	}
	
}
