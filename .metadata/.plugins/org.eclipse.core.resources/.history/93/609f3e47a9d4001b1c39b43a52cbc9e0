package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	 
	//Buscar
	public static void Buscar(WebDriver myBrowser, By textoBusqueda, By btnBuscar, String texto) {
		myBrowser.findElement(textoBusqueda).sendKeys(texto);
		myBrowser.findElement(btnBuscar).click();
	}
	
	
	//Validar Resultados
	public static void imprimirTexto(WebDriver driver, 
			 By nombreP1, By nombreP2, By nombreP3, By precioP1, By precioP2, By precioP3) {
			 
			String textoP1 = "nombre: "+ driver.findElement(nombreP1).getText()+ "precio: "+ driver.findElement(precioP1).getText();
			String textoP2 = "nombre: "+ driver.findElement(nombreP2).getText()+ "precio: "+ driver.findElement(precioP2).getText();
			String textoP3 = "nombre: "+ driver.findElement(nombreP1).getText()+ "precio: "+ driver.findElement(precioP3).getText();
			
			System.out.println(textoP1);
			System.out.println(textoP2);
			System.out.println(textoP3);
	}
	

}
