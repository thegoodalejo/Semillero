package com.sophossolutions.actions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	 
	//Buscar
	public static void Buscar(WebDriver myBrowser, By strstrTextoBusqueda, By byBtnBuscar, String strTexto) {
		myBrowser.findElement(strstrTextoBusqueda).sendKeys(strTexto);
		myBrowser.findElement(byBtnBuscar).click();
	}
	
	
	//Validar Resultados
	public static void imprimirTexto(WebDriver driver, 
			 By strNombreP1, By strNombreP2, By strNombreP3, By strPrecioP1, By strPrecioP2, By strPrecioP3) {
			
			String strTextoP1 = validarTexto(driver, strNombreP1, strPrecioP1);
			String strTextoP2 = validarTexto(driver, strNombreP2, strPrecioP2);
			String strTextoP3 = validarTexto(driver, strNombreP3, strPrecioP3);
			
			System.out.println(strTextoP1);
			System.out.println(strTextoP2);
			System.out.println(strTextoP3);
	}
	
	//Valida que el elemento tenga precio
	public static String validarTexto(WebDriver driver,By strNombre,By strPrecio) {
		
		String strRetorno;
			
			Boolean existeElemento = driver.findElements(strPrecio).size() != 0;
			
			if(existeElemento) {
				strRetorno= "nombre: "+ driver.findElement(strNombre).getText() + ", precio: "+ driver.findElement(strPrecio).getText();
			}
			else {
				strRetorno= "nombre: "+ driver.findElement(strNombre).getText() + ", el elemento no tiene precio";
			}
			
		
		return strRetorno;
	}
	

}
