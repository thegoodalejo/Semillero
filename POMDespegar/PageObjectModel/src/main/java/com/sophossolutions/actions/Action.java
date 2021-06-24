package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Action {
	
	public static void navigateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void selecRuta(WebDriver myBrowser, By cerrarPop, By origen, By destino, By select, String strOrigen, String strDestino) {

		myBrowser.findElement(origen).click();
		myBrowser.findElement(origen).sendKeys(strOrigen);
		myBrowser.findElement(select).click();
		myBrowser.findElement(destino).click();
		myBrowser.findElement(destino).sendKeys(strDestino);
		myBrowser.findElement(select).click();
		myBrowser.findElement(cerrarPop).click();
	}
	
	public static void selecFecha(WebDriver myBrowser, By ida, By fechaIda, By fechaVuelta) {
		myBrowser.findElement(ida).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myBrowser.findElement(fechaIda).click();
		myBrowser.findElement(fechaVuelta).click();
	}

	public static void selPasajeros(WebDriver myBrowser, By pasajeros, By adultos, By menores, By edad, By clase, String strClase,
			By buscar) {
		
		myBrowser.findElement(pasajeros).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myBrowser.findElement(adultos).click();
		myBrowser.findElement(menores).click();
		//myBrowser.findElement(edad).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement selectEdad = myBrowser.findElement(edad);
		Select opcionEdad = new Select(selectEdad);
		opcionEdad.selectByValue("4");
		
		WebElement selectClase = myBrowser.findElement(clase);
		Select opcionClase = new Select(selectClase);
		opcionClase.selectByValue(strClase);
		
		myBrowser.findElement(buscar).click();
		
	}

	public static void selNombre(WebDriver driver, By nombre1, By nombre2, By precio1, By precio2) {
		String resultado1 = "Por la aerolinea "+ driver.findElement(nombre1).getText()+ " tiene precio de: $"+ driver.findElement(precio1).getText();
		String resultado2 = "Por la aerolinea "+ driver.findElement(nombre2).getText()+ " tiene precio de: $"+ driver.findElement(precio2).getText();
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
		

}
