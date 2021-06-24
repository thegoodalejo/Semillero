package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.*;

import net.thucydides.core.pages.PageObject;



public class DespegarHome extends PageObject{
	
	By barraOrigen= By.xpath("//input[@placeholder='Ingresa desde dónde viajas']");
	By seleccionar= By.xpath("//html/body/div[3]/div/div/ul/li[1]");
	By barraDestino= By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']");
	By btnfechaIda=  By.xpath("//input[@placeholder='Ida']");
	By btnfechaRegreso = By.xpath("//input[@placeholder='Vuelta']");
	By btnfechaInicial = By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[25]/div");
	By btnfechaVuelta = By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[26]/div");
	By btnAplicar = By.xpath("//div[@class=\"calendar-footer\"]//em[@class='btn-text']");
	//div[@class="calendar-footer"]//em[@class='btn-text']
	//html/body/div[3]/div/div/ul/li[1]
	
	
	
	public void navegateTo(String url) {
		ActionsDespegar.navegateToUrl(getDriver(), url);
	}
	
	public void buscar(String strOrigen, String strDestino) {
		ActionsDespegar.buscar(getDriver(),barraOrigen,barraDestino, strOrigen, strDestino, seleccionar);
	}
	public void selecionarFecha() {
		ActionsDespegar.fecha(getDriver(),btnfechaIda,btnfechaRegreso,btnfechaInicial,btnAplicar,btnfechaVuelta);
	
	}
}


