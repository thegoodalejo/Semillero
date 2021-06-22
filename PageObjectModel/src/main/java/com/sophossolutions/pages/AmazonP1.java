package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AmazonP1 extends PageObject{
	
	By busqueda = By.xpath("//input[@name='field-keywords']");
	By btnBuscar = By.xpath("//input[@value='Ir']");
	
	public void navigateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}

	public void buscar(String producto) {
		Action.buscar(getDriver(), btnBuscar, producto);
	}
}
