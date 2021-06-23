package com.sophossolutions.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Action {
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void escribir(WebDriver myBrowser, By campo, String strTexto) {
		myBrowser.findElement(campo).sendKeys(strTexto);		
	}

	public static void clickElement(WebDriver myBrowser, By elemento) {
		myBrowser.findElement(elemento).click();
	}
	
	public static String fecha(String strFechaIda) {
		String[] arrFecha = strFechaIda.split("-");;
		return arrFecha[0];		
	}

	public static void fechas(WebDriver myBrowser, By tabla, By celda, String diaSeleccion) {
		WebElement calendario = myBrowser.findElement(tabla);
		List<WebElement> dias = calendario.findElements(celda);
		
		for (WebElement dia : dias) {
			if(diaSeleccion.equals(dia.getText())) {
				dia.click();
				break;
			}
		}		
	}
	public static void lista(WebDriver myBrowser, By lista, By opcion, String eleccionElegida) {
		WebElement li = myBrowser.findElement(lista);
		List<WebElement> elecciones = li.findElements(opcion);
		
		for (WebElement ele : elecciones) {
			if(eleccionElegida.equals(ele.getText())) {
				ele.click();
				break;
			}
		}
	}

	public static void validateResults(WebDriver myBrowser, By strAerolinia, By dirPrecio) {
		
			String aerolinia=myBrowser.findElement(strAerolinia).getText();
			String precio=myBrowser.findElement(dirPrecio).getText();
			System.out.println(aerolinia+" "+precio);	
	}
}
