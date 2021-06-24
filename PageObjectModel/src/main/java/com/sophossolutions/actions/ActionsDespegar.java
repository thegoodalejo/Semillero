package com.sophossolutions.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		driver.findElement(btnAplicar).click();
		

	}
	public static void selecionarNiños(WebDriver driver, String strEdad, By btnOpciones, By btnMenores) {
		
		driver.findElement(btnOpciones).click();
		driver.findElement(btnOpciones).click();
		driver.findElement(btnMenores).click();
	}
	public static void seleccionarClase(WebDriver driver, String strEdad, By btnOpciones, By btnMenores) {
		
		driver.findElement(btnOpciones).click();
		driver.findElement(btnOpciones).click();
		driver.findElement(btnMenores).click();
	}


	public static void selecionarClase(WebDriver driver, By btnOpciones, By btnSeleccionarClase, By btnMenuTipo, String strTipo, By btnAplicarTipo) {
		
		driver.findElement(btnOpciones).click();
		driver.findElement(btnOpciones).click();
		
		    WebElement cabina=driver.findElement(btnMenuTipo);
	        List<WebElement> cabinas=cabina.findElements(btnSeleccionarClase);
	       
	        for(WebElement option:cabinas) {
	            if(strTipo.equals(option.getText())) {
	                option.click();
	                break;
	            }
	        }
	        driver.findElement(btnAplicarTipo).click(); 
	    }
}
	
	


