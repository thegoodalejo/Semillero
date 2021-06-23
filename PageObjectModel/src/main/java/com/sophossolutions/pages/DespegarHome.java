package com.sophossolutions.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class DespegarHome extends PageObject{
	By origen = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Ingresa desde dónde viajas']");
	By destino = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Ingresa hacia dónde viajas']");
	By fechaIda = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Ida']");
	By fechaVuelta = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Vuelta']");
	By btnAplicarFecha = By.xpath("//div[@class='calendar-footer']//button[@class='sbox5-3-btn -primary -md']");
	By pasajeroyclase = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//div[@class='sbox5-distribution-passengers--dbiHH']//input");
	By btnAgregaMayor = By.xpath("//div[@class='stepper__room__row'][1]//button[2]");	
	By btnAgregaMenor = By.xpath("//div[@class='stepper__room__row'][2]//button[2]");
	By listaEdades = By.xpath("//div[@class='stepper__room__row'][3]//select");
	By edades = By.xpath("//div[@class='stepper__room__row'][3]//option");
	By listaClases = By.xpath("//div[@class='sbox5-cabin-class--1ReWi']//select");
	By clases = By.xpath("//div[@class='sbox5-cabin-class--1ReWi']//option");
	By btnAplicarPyC = By.xpath("//div[@class='stepper__room__footer ']//em");
	By btnBuscar = By.xpath("//div[@class='sbox5-button-container--1X4O8']//button");
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}	
	public void buscar(String strOrigen, String strDestino, String strFechaIda, String strFechaVuelta,int numMay,int numMen,String strEdad,String strClase){
		Action.clickElement(getDriver(), origen);
		Action.escribir(getDriver(), origen, strOrigen);
		Action.clickElement(getDriver(), By.xpath("//li[@class='item -active']"));
		//getDriver().manage().wait(200);
		//getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Action.clickElement(getDriver(), destino);
		Action.escribir(getDriver(), destino, strDestino);
		Action.clickElement(getDriver(), By.xpath("//li[@class='item -active']"));
		
		Action.clickElement(getDriver(),fechaIda);
		String dia = Action.fecha(strFechaIda);
		Action.fechas(getDriver(), By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][2]//div[3]"), By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][2]//div[3]/div"), dia);
		Action.clickElement(getDriver(),fechaVuelta);
		String dia2 = Action.fecha(strFechaVuelta);
		Action.fechas(getDriver(), By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][2]//div[3]"), By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid'][2]//div[3]/div"), dia2);
		Action.clickElement(getDriver(), btnAplicarFecha);
		
		Action.clickElement(getDriver(), pasajeroyclase);
		Action.clickElement(getDriver(), pasajeroyclase);
		if (1 < numMay) {
			for (int i = 2; i<numMay;i++) {
				Action.clickElement(getDriver(), btnAgregaMayor);
			}
		}
		Action.clickElement(getDriver(), btnAgregaMenor);
		Action.lista(getDriver(), listaEdades, edades, strEdad);
		Action.lista(getDriver(), listaClases, clases, strClase);	
		Action.clickElement(getDriver(), btnAplicarPyC);
		Action.clickElement(getDriver(), btnBuscar);
		
	}
}
