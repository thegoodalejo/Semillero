package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.*;

import net.thucydides.core.pages.PageObject;



public class DespegarHome extends PageObject{
	//Selecionar Destino
	By barraOrigen= By.xpath("//input[@placeholder='Ingresa desde dónde viajas']");
	By seleccionar= By.xpath("//html/body/div[3]/div/div/ul/li[1]");
	By barraDestino= By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']");
	
	//Selecionar fechas
	By btnFechaIda=  By.xpath("//input[@placeholder='Ida']");
	By btnFechaRegreso = By.xpath("//input[@placeholder='Vuelta']");
	By btnAplicar = By.xpath("//div[@class=\"calendar-footer\"]//em[@class='btn-text']");

	
	String pathFechaInicial = "//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[%d]/div";
	String pathFechaRegreso = "//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[%d]/div";
	
	//Selecionar Niños
	By btnOpciones=  By.xpath("//div/div[2]/div[1]/div[1]/div[4]/div/div/div");
	By btnMenores=  By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
	By btnDesplegarOpciones=  By.xpath("//select[@class='select']");
	By btnOpcionesEdad=  By.xpath("//select[@class='select']//option[@value]");
	//*[@id="component-modals"]/div[3]/div/div/div[1]/div[3]/div[2]/div/div/select
	
	//Selecionar Clase
	By btnSeleccionarClase=  By.xpath("//div[@class='sbox5-3-select -lg']//select[@class='select-tag']//option[@class='select-option']");
	By btnMenuTipo=  By.xpath("//div[@class='sbox5-3-select -lg']//select[@class='select-tag']");
	By btnAplicarTipo=  By.xpath("//div[3]/div/div/div[3]/a/em");
	
	//Precionar Buscar
	By btnBuscarVuelo=  By.xpath("//div/div[2]/div[3]/button/em");
	//div/div[2]/div[3]/button/em
	public void navegateTo(String url) {
		ActionsDespegar.navegateToUrl(getDriver(), url);
	}
	
	public void buscar(String strOrigen, String strDestino) {
		ActionsDespegar.buscar(getDriver(),barraOrigen,barraDestino, strOrigen, strDestino, seleccionar);
	}
	public void selecionarFecha(Integer ida, Integer regreso) {
		
		By btnfechaInicial = By.xpath(String.format(pathFechaInicial, ida));
		By btnfechaVuelta = By.xpath(String.format(pathFechaRegreso, regreso));
		
		ActionsDespegar.fecha(getDriver(),btnFechaIda,btnFechaRegreso,btnfechaInicial,btnAplicar,btnfechaVuelta);
	}
	public void seleccionarNiños(String strEdad) {
		
		ActionsDespegar.selecionarNiños(getDriver(), strEdad, btnOpciones, btnMenores, btnDesplegarOpciones, btnOpcionesEdad,btnAplicarTipo);
	}

	public void seleccionarClase(String strTipo) {
		
		 
		ActionsDespegar.selecionarClase(getDriver(), btnOpciones, btnSeleccionarClase, btnMenuTipo, strTipo, btnAplicarTipo);
    	ActionsDespegar.Buscar(getDriver(), btnBuscarVuelo);
	//	String tituloProducto = drive.findElement(target).getText();
	//	System.out.println("Vuelos mas economicos : ");
	    }
}



