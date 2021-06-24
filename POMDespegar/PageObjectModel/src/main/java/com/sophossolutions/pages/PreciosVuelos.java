package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class PreciosVuelos extends PageObject{
	
	By nombre1 = By.xpath("(//span[@data-sfa-id='airline-name-matrix'])[1]");
	By nombre2 = By.xpath("(//span[@data-sfa-id='airline-name-matrix'])[2]");
	By precio1 = By.xpath("//li[@class='priceItem price price-best']//span[@class='amount price-amount']");
	By precio2 = By.xpath("(//li[@class='priceItem price']//span[@class='amount price-amount'])[1]");
	
	public void imprimirPrecio() {
		Action.selNombre(getDriver(), nombre1, nombre2, precio1, precio2);
	}

}
