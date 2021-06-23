package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonP2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonP2StepDefinitions {
	
	AmazonP2 amazonP2;

	@Given("Deseo ir a la pagina de {string}")
	public void Deseo_ir_a_la_pagina_de(String string) {
		amazonP2.open();
	}
	
	@When("Ingreso el producto {string}")
	public void ingreso_el_producto(String string) {
	    amazonP2.Buscar(string);
	}

	@Then("Imprimo los tres articulos con sus precios")
	public void imprimoLosTresArticulosConSusPrecios() {
		amazonP2.imprimirTexto();  
	}
}
