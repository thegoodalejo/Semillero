package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsMercadoLibre {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void buscar(WebDriver myBrowser, By btnBusqueda,By producto,String strProducto) {
		myBrowser.findElement(producto).sendKeys(strProducto);
		myBrowser.findElement(btnBusqueda).click();
	}

	public static void validateResults(WebDriver myBrowser, By strNombre,By strPrecio) {
		
		String nombre=myBrowser.findElement(strNombre).getText();
		String precio=myBrowser.findElement(strPrecio).getText();
		System.out.println(nombre+" "+precio);
	}

}
