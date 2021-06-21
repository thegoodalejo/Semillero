package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions
{
	@Given("Deseo ingresar a la pagina {string}")
	public void deseoIngresarALaPagina(String string) {
		System.out.println("@Given");
	}

	@When("ingreso nombre de usurio {string} y contraseña {string}")
	public void ingresoNombreDeUsurioYContraseña(String string, String string2) {
		System.out.println("@Given");
	}

	@Then("valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		System.out.println("@Given");
	}
}