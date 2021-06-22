package com.sophossolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.actions.*;

import net.thucydides.core.pages.PageObject;

public class MercadoLibreHome extends PageObject{
	By barraBusqueda= By.xpath("//input[@class='nav-search-input']");
	By btnBusqueda=By.xpath("//button[@type='submit']");

	public void navegateTo(String url) {
		ActionsMercadoLibre.navegateToUrl(getDriver(), url);
	}
	
	public void buscar(String strProducto) {
		ActionsMercadoLibre.buscar(getDriver(),btnBusqueda,barraBusqueda, strProducto);
	}

	
}
