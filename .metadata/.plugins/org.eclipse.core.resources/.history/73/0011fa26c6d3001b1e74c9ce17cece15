package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.amazon.com/")
public class AmazonP1 extends PageObject {
	
	By textoBusqueda = By.name("field-keywords");
	By btnBuscar = By.id("nav-search-submit-button");
	By nombreP1 = By.xpath("//div[@data-index='1' and @data-asin]//h2//span");
	By nombreP2 = By.xpath("//div[@data-index='16' and @data-asin]//h2//span");
	By nombreP3 = By.xpath("//div[@data-index='19' and @data-asin]//h2//span");
	By precioP1 = By.xpath("//div[@data-index='1' and @data-asin]//span[@class='a-price-whole']");
	By precioP2 = By.xpath("//div[@data-index='16' and @data-asin]//span[@class='a-price-whole']");
	By precioP3 = By.xpath("//div[@data-index='19' and @data-asin]//span[@class='a-price-whole']");

	 //Busqueda
	 public void Buscar(String texto) {
		Action.Buscar(getDriver(), textoBusqueda,btnBuscar,texto);
	 }
	 
	 //Validar Texto
	 public void validarTexto(String strP1, String strP2, String strP3) {
		 
		 Action.validarTexto(getDriver(), nombreP1, nombreP2, nombreP3, precioP1, precioP2, precioP3, strP1, strP2, strP3);
		 
	 }

}
