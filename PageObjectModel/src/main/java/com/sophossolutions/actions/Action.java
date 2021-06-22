package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	 
	//Navegar a las vistas de la pagina
	/*public static void navegateToUrl(WebDriver myBrowser, String url) {
		 myBrowser.navigate().to(url);
	 }
	
	//Inicio de sesión
	public static void Login(WebDriver myBrowser, 
			By userName, By password, By btnLogin,
			String strUserName, String strPassword) {
		
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
	}
	
	//Validar texto	
	public static void validateText(WebDriver driver, 
		 By title, 
		 String strTittle ) {
		 
		String tituloActual = driver.findElement(title).getText();
		assertEquals("El valor esperado: \""+strTittle+"\", es diferente a: \""+tituloActual+"\"\"", 
				strTittle,
				tituloActual);
		 
	}*/
	
	//Buscar
	public static void Buscar(WebDriver myBrowser, By textoBusqueda, By btnBuscar, String texto) {
		myBrowser.findElement(textoBusqueda).sendKeys(texto);
		myBrowser.findElement(btnBuscar).click();
	}
	
	
	//Validar Resultados
	public static void validarTexto(WebDriver driver, 
			 By nombreP1, By nombreP2, By nombreP3, By precioP1, By precioP2, By precioP3,
			 String strP1, String strP2, String strP3 ) {
			 
			String textoP1 = "nombre: "+ driver.findElement(nombreP1).getText()+ "precio: "+ driver.findElement(precioP1).getText();
			String textoP2 = "nombre: "+ driver.findElement(nombreP2).getText()+ "precio: "+ driver.findElement(precioP2).getText();
			String textoP3 = "nombre: "+ driver.findElement(nombreP1).getText()+ "precio: "+ driver.findElement(precioP3).getText();
			
			System.out.println(textoP1);
			System.out.println(textoP2);
			System.out.println(textoP3);
	}
	

	public static void buscar(WebDriver myBrowser, By busqueda, String producto) {
		myBrowser.findElement(busqueda).sendKeys("escritorio");
		
	}

}
