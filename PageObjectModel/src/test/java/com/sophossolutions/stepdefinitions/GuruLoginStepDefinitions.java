package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroHome;
import com.sophossolutions.pages.GuroLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {

	GuroLogin loginGuru;
	GuroHome homeGuru;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
		loginGuru.navegateTo(url);
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String string, String string2) {
		System.out.println("@When");
		loginGuru.Login(string, string2);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		System.out.println("@Then");
		homeGuru.validartextop(string);
	}

}
