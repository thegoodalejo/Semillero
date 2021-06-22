package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonP3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonP3StepDefinition 
{
	AmazonP3 a3;

	@Given("Deseo ir a la pagina de {string}")
	public void DeseoIrALaPaginaDe(String string) {
		a3.open();
	}
	
	@When("Ingreso el producto {string}")
	public void ingresoElProducto(String string) {
	    a3.Buscar(string);
	}

	@Then("Valido que el producto {string}")
	public void validoQueElProducto(String string) {
	    
	}
}