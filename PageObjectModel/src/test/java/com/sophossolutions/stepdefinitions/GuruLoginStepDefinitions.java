package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	GuruLogin loginGuru;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
	    System.out.println("@Given");
	    loginGuru.navegateTo(url);
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
