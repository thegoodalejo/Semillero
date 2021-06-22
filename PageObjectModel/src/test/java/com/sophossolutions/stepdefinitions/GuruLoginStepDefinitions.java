package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	GuroLogin loginGuru;
	
	@Given("Deseo ir ala pagina de {string}")
	public void deseoIrAlaPaginaDe(String string) {
	    System.out.println("@Given");
	    loginGuru.navegateTo(string);
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String string, String string2) {
		System.out.println("@When");
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		System.out.println("@Then");
	}
}
