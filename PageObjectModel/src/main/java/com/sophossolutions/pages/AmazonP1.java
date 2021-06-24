package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.amazon.com/")
public class AmazonP1 extends PageObject {

	By byTextoBusqueda = By.name("field-keywords");
	By byBtnBuscar = By.id("nav-search-submit-button");
	By byNombreP1 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//h2");
	By byNombreP2 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//h2");
	By byNombreP3 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-5']//h2");
	By byPrecioP1 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//span[@class = 'a-price']");
	By byPrecioP2 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//span[@class = 'a-price']");
	By byPrecioP3 = By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-5']//span[@class = 'a-price']");

	 //Busqueda
	 public void Buscar(String strProducto) {
		Action.Buscar(getDriver(), byTextoBusqueda,byBtnBuscar,strProducto);
	 }
	 
	 //Validar Texto
	 public void imprimirTexto() {
		 
		 Action.imprimirTexto(getDriver(), byNombreP1, byNombreP2, byNombreP3, byPrecioP1, byPrecioP2, byPrecioP3);
		 
	 }
}
