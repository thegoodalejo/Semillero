package com.sophossolutions.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.amazon.com/")
public class AmazonBusqueda extends PageObject {
	
	By busqueda = By.name("field-keywords");
	By btnBuscar = By.id("nav-search-submit-button");

}
