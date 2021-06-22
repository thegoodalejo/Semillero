package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AliExpress3Home extends PageObject{

	By producto = By.xpath("//input[@name='SearchText']");
	By btn = By.xpath("//input[@class='search-button']");
	
	public void BuscarProducto(String strtexto) {
		Action.IngresarProduc(getDriver(), producto,btn, strtexto);
	}
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
}
