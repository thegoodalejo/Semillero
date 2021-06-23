package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AmazonP3 extends PageObject
{
	By textoBusqueda = By.name("field-keywords");
	By btnBuscar = By.id("nav-search-submit-button");
	By nombreP1 = By.xpath("//div[@data-index='2' and @data-asin]//h2//span");
	By nombreP2 = By.xpath("//div[@data-index='5' and @data-asin]//h2//span");
	By nombreP3 = By.xpath("//div[@data-index='7' and @data-asin]//h2//span");
	By precioP1 = By.xpath("//div[@data-index='2' and @data-asin]//span[@class='a-price']");
	By precioP2 = By.xpath("//div[@data-index='5' and @data-asin]//span[@class='a-price']");
	By precioP3 = By.xpath("//div[@data-index='7' and @data-asin]//span[@class='a-price']");
	
	public void Buscar(String texto)
	{	
		Action.Buscar(getDriver(), textoBusqueda,btnBuscar,texto);
	}
}