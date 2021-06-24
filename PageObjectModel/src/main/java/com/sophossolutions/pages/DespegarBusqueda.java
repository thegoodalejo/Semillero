package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.ActionsDespegar;

import net.thucydides.core.pages.PageObject;

public class DespegarBusqueda extends PageObject {
	By barraOrigen= By.xpath("//toolbox-tabs/div/tabs/div/div[1]/div/ul/li[1]");
	By strPrecios= By.xpath("//span[@class=\"pricebox-big-text price\"]");
	
	
	
	public void vuelosEconomicos() {
		ActionsDespegar.vuelosPorAerolinea(getDriver(), barraOrigen, strPrecios);
	}

}
