package com.sophossolutions.actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
	
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
	
	

	public static void buscar(WebDriver myBrowser, By barOrigen,String strOrigen) {
		myBrowser.findElement(barOrigen).sendKeys(strOrigen);
	}



	public static void presionarBoton(WebDriver myBrowser,By boton) {
		myBrowser.findElement(boton).click();
		
	}
	
	public static void seleccionarCabina(WebDriver myBrowser,By boton,By elementos,String strClase) {
		WebElement cabina=myBrowser.findElement(boton);
		List<WebElement> cabinas=cabina.findElements(elementos);
		
		for(WebElement option:cabinas) {
			if(strClase.equals(option.getText())) {
				option.click();
				break;
			}
		}
		
	}
	
	public static void seleccionarEdad(WebDriver myBrowser,By boton,By elementos,String strEdad) {
		WebElement edad=myBrowser.findElement(boton);
		List<WebElement> Edades=edad.findElements(elementos);
		
		for(WebElement option:Edades) {
			if(strEdad.equals(option.getText())) {
				option.click();
				break;
			}
		}
		
	}

	public static void esperar(WebDriver myBrowser) {
		myBrowser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	

}
