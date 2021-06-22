package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuruLogin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	
	GuruLogin login;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
		
		login.navegateTo(url);
	}

	@When("Ingreso el nombre de usuario {string} y password {string}")
	public void ingresoElNombreDeUsuarioYPassword(String string, String string2) {
		System.out.println("@When");
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
	    System.out.println("@Then");
	}


}


