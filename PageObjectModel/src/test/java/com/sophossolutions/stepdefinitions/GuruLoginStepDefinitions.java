package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	
	GuroLogin loginGuru;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@Given");
	    loginGuru.navegateTo(url);
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@When");
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@Then");
	}

}
