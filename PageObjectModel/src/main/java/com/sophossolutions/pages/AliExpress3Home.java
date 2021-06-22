package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AliExpress3Home extends PageObject{

	By producto = By.xpath("//input[@name='SearchText']");
	By btn = By.xpath("//input[@class='search-button']");
	By btncerrar = By.xpath("//img[@src='https://ae01.alicdn.com/kf/H5545b1dae97243fba06c33bd33104b84G.png']");
	
	public void BuscarProducto(String strtexto) {
		Action.IngresarProduc(getDriver(), producto,btn,btncerrar, strtexto);
	}
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
}
