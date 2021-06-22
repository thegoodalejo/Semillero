package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.MercadoLibreHome;
import com.sophossolutions.pages.MercadoLibreResultado;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class busquedaProductosStepDefinitions {
	
	MercadoLibreHome busquedaHome; 
	MercadoLibreResultado resultado;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
		busquedaHome.navegateTo(url);
		//loginGuru.navegateTo(url);
		//loginGuru.open();
	}
	
	@When("Ingreso nombre de producto  {string}")
	public void ingresoNombreDeProducto(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    busquedaHome.buscar(string);
	}

	@Then("Muestro nombre y precio del producto")
	public void muestroNombreYPrecioDelProducto() {
	    // Write code here that turns the phrase above into concrete actions
	    resultado.validateResult();
	}

}
