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



	public static void selecciona(WebDriver driver, By btnOtros, By selClase, By opClases, String strClase) {
		presionarBoton(driver,btnOtros);
		presionarBoton(driver,btnOtros);
		presionarBoton(driver,selClase);
		presionarBoton(driver,selClase);
		seleccionarCabina(driver, selClase, opClases, strClase);
		
	}
	public static void imprimiResultados() {
		
	}



	public static void ingresarPersonas(WebDriver driver, By btnOtros, By btnMasAdultos, String strCantidad) {
		presionarBoton(driver,btnOtros);
		presionarBoton(driver,btnOtros);
		if(strCantidad!="1") {
			for(int i=1;i<Integer.parseInt(strCantidad);i++) {
				presionarBoton(driver,btnMasAdultos);
			}
		}
		
	}



	public static void ingresarOrigen(WebDriver driver, By barOrigen, By btnOrigen,String strOrigen) {
		presionarBoton(driver, barOrigen);
		buscar(driver, barOrigen, strOrigen);
		presionarBoton(driver, btnOrigen);
		
	}

	

}
