package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class BuscarVuelo extends PageObject {
	
	By cerrarPop = By.xpath("//i[@class='tooltip-close dreck-3-icon-close incentive-close']");
	By origen = By.xpath("(//input[@placeholder = 'Ingresa desde dónde viajas'])[1]");
	By destino = By.xpath("(//input[@placeholder = 'Ingresa hacia dónde viajas'])[1]");
	By select = By.xpath("//li[@class = 'item -active']");
	By ida = By.xpath("(//div[@class='sbox5-dates-input1-container'])[1]");
	By pasajeros = By.xpath("(//input[@placeholder = ''])[1]");
	By adultos = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[1]");
	By menores = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[2]");
	By edad = By.xpath("//select[@class='select']");
	By buscar = By.xpath("//em[text()='Buscar']");
	
	public void navigateTo(String url) {
		Action.navigateToUrl(getDriver(), url);
	}
	
	public void ingresarRuta(String strOrigen, String strDestino) {
		Action.selecRuta(getDriver(), cerrarPop, origen, destino, select, strOrigen, strDestino);
	}
	
	public void seleccionarFecha(String strIda, String strVuelta) {
		By fechaIda = By.xpath("(//div[contains(@data-month,'06')]//div[text()='"+strIda+"'])[1]");
		By fechaVuelta = By.xpath("(//div[contains(@data-month,'07')]//div[text()='"+strVuelta+"'])[1]");
		Action.selecFecha(getDriver(), ida, fechaIda, fechaVuelta);
	}
	
	public void selectPasajeros(String strClase) {
		By clase = By.xpath("//select[@class='select-tag']");
		Action.selPasajeros(getDriver(), pasajeros, adultos, menores, edad, clase, strClase, buscar);
	}
	
}
