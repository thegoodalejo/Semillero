package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;
import com.sophossolutions.pages.GuruHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	GuroLogin loginGuru;
	GuruHome homeGuru;
	
	@Given("Deseo ir ala pagina de {string}")
	public void deseoIrAlaPaginaDe(String string) {
	    System.out.println("@Given");
	    loginGuru.navegateTo(string);
	    //loginGuru.open();
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUserName, String strPassword) {
		System.out.println("@When");
		loginGuru.login(strUserName, strPassword);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		System.out.println("@Then");
		homeGuru.validateTitle(string);
	}
}
