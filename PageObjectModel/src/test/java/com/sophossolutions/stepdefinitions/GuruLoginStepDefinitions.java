package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.sophossolutions.pages.GuroLogin;

public class GuruLoginStepDefinitions {
	GuroLogin loginGuru;

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
		loginGuru.navegateTo(url);
		
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
