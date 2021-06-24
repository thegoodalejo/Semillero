package com.sophossolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.despegar.com.co/")
public class DespegarHome extends PageObject {
	
	WebDriver driver = getDriver();
	
	//By para Lugares
	By byOrigen = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[contains(@placeholder, 'desde')]");
	By byDestino = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[contains(@placeholder, 'hacia')]");
	By byBuscar = By.xpath("//div[contains(@class, 'sbox5-box-content--2pcCl')]//button");
	By byItemActivo = By.xpath("//li[@class = 'item -active']");
	//By para Fechas
	By byBtnFecha = By.xpath("(//input[@readonly and @placeholder='Ida'])[1]");
	By byBtnAplicar = By.xpath("//button[@class='sbox5-3-btn -primary -md']");
	//By para personas y clase
	By byBtnPersonas = By.xpath("(//div[@class='sbox5-passengers-distribution-container']//input[@class='input-tag'])[1]");
	By byInputPersona = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[1]");
	By byInputNinos = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[2]");
	//By para agregar edad del niño
	By bySelect = By.xpath("//div[@class='stepper__distribution_container']//select");
	By byOpciones = By.xpath("//div[@class='stepper__distribution_container']//select//option");
	//By para agregar clase
	By bySelectClase = By.xpath("//div[@class='sbox5-cabin-class--1ReWi']//select");
	By byOpcionesClase = By.xpath("//div[@class='sbox5-cabin-class--1ReWi']//select//option");
	//By para mostrar Resultados
	By byAerolineas = By.xpath("//div[@class='matrix-airlines-container matrix-airlines-container-2']");
	By byOpcionesAerolineas = By.xpath("//div[@class='matrix-airlines-container matrix-airlines-container-2']//airlines-matrix-airline");
	
	//Navegar al sitio principal
	public void navegarUrl(String strUrl) {
		Action.navegarUrl(getDriver(), strUrl);
	}	
	
	//Agregar Lugares
	public void agregarLugares(String strOrigen, String strDestino) {
		Action.agregarLugares(getDriver(),byOrigen,byDestino,byItemActivo,strOrigen, strDestino);
	}
	
	//Agregar Fechas
	public void agregarFechas(String strIda, String strRegreso) {
		Action.agregarFechas(getDriver(),byBtnFecha,byBtnAplicar, strIda,strRegreso);		
	}
	
	//Agregar Pasajeros
	public void agregarPasajarosYclase(Integer intEdad,String strClase) {
		Action.agregarPasajerosYclase(getDriver(),byBtnPersonas, byInputPersona,byInputNinos, strClase);
		Action.agregarEdadNino(getDriver(),bySelect,byOpciones,intEdad);
		Action.agregarClase(getDriver(),bySelectClase,byOpcionesClase,byBuscar, strClase);
		//Action.mostrarResultados(getDriver(), byAerolineas,byOpcionesAerolineas);
	}

	
	
	
	
}
