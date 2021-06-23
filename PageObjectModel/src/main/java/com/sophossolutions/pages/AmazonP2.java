package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class AmazonP2 extends PageObject {
	
	By textoBusqueda = By.name("field-keywords");
	By btnBuscar = By.id("nav-search-submit-button");
	By nombreP1 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//h2");
	By nombreP2 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//h2");
	By nombreP3 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-5']//h2");
	By precioP1 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//span[@class = 'a-price']");
	By precioP2 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//span[@class = 'a-price']");
	By precioP3 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-5']//span[@class = 'a-price']");

	 //Busqueda
	 public void Buscar(String texto) {
		Action.Buscar(getDriver(), textoBusqueda,btnBuscar,texto);
	 }
	 
	 //Validar Texto
	 public void imprimirTexto() {
		 
		 Action.imprimirTexto(getDriver(), nombreP1, nombreP2, nombreP3, precioP1, precioP2, precioP3);
		 
	 }
	
}
