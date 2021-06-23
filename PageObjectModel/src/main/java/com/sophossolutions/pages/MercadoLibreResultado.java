package com.sophossolutions.pages;

import org.openqa.selenium.By;


import com.sophossolutions.actions.ActionsMercadoLibre;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreResultado extends PageObject{
	
	String strPathProducto = "//ol/li[%s]/div/div/div[2]/div[1]/a/h2";
	String strPathPrecio = "//ol/li[%s]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]";
	
	By dirProducto ;
	By dirPrecio ;
	
	
	public void validateResult(String strNumero){
		dirProducto = By.xpath(String.format(strPathProducto, strNumero));
		dirPrecio = By.xpath(String.format(strPathPrecio, strNumero));
			
						 
		ActionsMercadoLibre.validateResults(getDriver(), dirProducto, dirPrecio);
		
	}

}
