package com.sophossolutions.pages;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/v4")
public class DespegarSearch extends PageObject {
		
	By btnVuelos = By.xpath("//a[@data-action='flights-click']");
	
	By origen = By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
	By destino = By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
	
	By fechaIda = By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input");
	By fechaVuelta = By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input");

	By btnPasajeros = By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
	By btnAddAdultos = By.xpath("//*[@id='component-modals']/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
	By btnAddMenores = By.xpath("//*[@id='component-modals']/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
	
	By selectEdad = By.xpath("//select[@class='select']");
	By selectClase = By.xpath("//*[@id='component-modals']/div[3]/div/div/div[2]/div[2]/div/div/div/select");
	
	By btnAplicar = By.xpath("//a[@class='sbox5-3-btn -md -primary']");
	By btnBuscar = By.xpath("//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']");
	
	By clusters = By.xpath("//div[@id='clusters']");
	
	public void navegateTo(String url) {		
		Action.navegateToUrl(getDriver(), url, btnVuelos);		
	}
	
	public void ingresarOrigenYDestino(String strOrigen, String strDestino) throws InterruptedException {		
		Action.ingresarCiudades(getDriver(), origen, destino, strOrigen, strDestino);
	}
	
	public void ingresarIdaYVuelta(int diaIda, int diaVuelta) {
		Action.ingresarFechas(getDriver(), fechaIda, fechaVuelta, diaIda, diaVuelta);
	}
	
	public void ingresarAdultosYMenores(int cantAdultos, int cantMenores, String strEdad) throws InterruptedException {
		Action.ingresarCantidadPasajeros(getDriver(), btnPasajeros, selectEdad, btnAddAdultos, btnAddMenores, cantAdultos, cantMenores, strEdad);
	}
	
	public void seleccionarClase(String strClase) throws InterruptedException {
		Action.seleccionarClase(getDriver(), selectClase, btnAplicar, btnBuscar, strClase);
	}
	
	public void mostrarResultados() {
		Action.mostrarResultados(getDriver(), clusters);
		getDriver().close();
	}
	
}

