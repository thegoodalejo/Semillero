package com.sophossolutions.pages;

import org.openqa.selenium.By;


import com.sophossolutions.actions.ActionsMercadoLibre;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreResultado extends PageObject{
	
	By dirProducto1 =By.xpath("//ol/li[1]/div/div/div[2]/div[1]/a/h2");
	By dirPrecio1 =By.xpath("//ol/li[1]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]");
	
	By dirProducto2 =By.xpath("//ol/li[3]/div/div/div[2]/div[1]/a/h2");
	By dirPrecio2 =By.xpath("//ol/li[3]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]");
	
	By dirProducto3 =By.xpath("//ol/li[7]/div/div/div[2]/div[1]/a/h2");
	By dirPrecio3 =By.xpath("//ol/li[7]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]");
	
	public void validateResult(){
		ActionsMercadoLibre.validateResults(getDriver(), dirProducto1, dirPrecio1);
		ActionsMercadoLibre.validateResults(getDriver(), dirProducto2, dirPrecio2);
		ActionsMercadoLibre.validateResults(getDriver(), dirProducto3, dirPrecio3);
	}

}
