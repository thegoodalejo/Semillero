package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonP1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonP1StepDefinitions {

	AmazonP1 amazonP1;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		amazonP1.open();
	}

	@When("Ingreso el producto {string}")
	public void ingresoElProducto(String strProducto) {
	    amazonP1.Buscar(strProducto);
	}

	@Then("Imprimo los tres articulos con sus precios")
	public void imprimoLosTresArticulosConSusPrecios() {
		amazonP1.imprimirTexto(); 
	}
	
}
