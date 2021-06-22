package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class AmazonP2 extends PageObject {
	
	By textoBusqueda = By.name("field-keywords");
	By btnBuscar = By.id("nav-search-submit-button");
	By nombreP1 = By.xpath("//div[@data-index='1' and @data-asin]//h2//span");
	By nombreP2 = By.xpath("//div[@data-index='16' and @data-asin]//h2//span");
	By nombreP3 = By.xpath("//div[@data-index='19' and @data-asin]//h2//span");
	By precioP1 = By.xpath("//div[@data-index='1' and @data-asin]//span[@class='a-price']");
	By precioP2 = By.xpath("//div[@data-index='16' and @data-asin]//span[@class='a-price']");
	By precioP3 = By.xpath("//div[@data-index='19' and @data-asin]//span[@class='a-price']");

	 //Busqueda
	 public void Buscar(String texto) {
		Action.Buscar(getDriver(), textoBusqueda,btnBuscar,texto);
	 }
	
}