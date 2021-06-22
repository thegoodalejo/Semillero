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
	}

}
