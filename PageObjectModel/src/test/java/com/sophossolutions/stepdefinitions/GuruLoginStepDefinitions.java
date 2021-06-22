package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GuruLoginStepDefinitions {
	
	GuroLogin guroLogin;

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
		guroLogin.navegateToUrl(string);
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
