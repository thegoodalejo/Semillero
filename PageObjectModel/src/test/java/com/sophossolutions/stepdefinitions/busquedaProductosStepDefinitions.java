package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.MercadoLibreHome;
import com.sophossolutions.pages.MercadoLibreResultado;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class busquedaProductosStepDefinitions {
	
	MercadoLibreHome busquedaHome; 
	MercadoLibreResultado resultado;
	

	    
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String strUrl) {
		busquedaHome.navegateTo(strUrl);
	    
	}

	@When("Ingreso nombre de producto (.+)$")
	public void ingresoNombreDeProducto(String strNombreProducto) {
		busquedaHome.buscar(strNombreProducto);
	    
	}

	@Then("Muestro nombre y precio del producto {string}")
	public void muestroNombreYPrecioDelProducto(String strListNum) {
		
		String[] arrNum = strListNum.split(",");
		for (int i=0; i<arrNum.length; i++) {
		resultado.validateResult(arrNum[i]);}
	}
	
	

}
