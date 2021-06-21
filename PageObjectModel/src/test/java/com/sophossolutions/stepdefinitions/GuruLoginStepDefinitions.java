package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
	    System.out.println("@Given");
	}

	@When("Ingreso nombre de usuario {string} y contraseña {string}")
	public void ingresoNombreDeUsuarioYContraseña(String string, String string2) {
	    System.out.println("@When");
	}

	@Then("Validar que el titulo sea {string}")
	public void validarQueElTituloSea(String string) {
	    System.out.println("@Then");
	}

}
