package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class DespegarResultado extends PageObject {
	String strPathAerolinea = "//airlines-matrix-airline[1]/ul/li[1]/div/div/div[2]/span";
	String strPathPrecio = "//airlines-matrix-airline[1]/ul/li[2]/span/flights-price/span/flights-price-element/span";
	
	By dirAerolinia ;
	By dirPrecio ;
	
	
	public void validateResult(){
		dirAerolinia = By.xpath(strPathAerolinea);
		dirPrecio = By.xpath(strPathPrecio);		
						 
		Action.validateResults(getDriver(), dirAerolinia, dirPrecio);
		
	}

}
