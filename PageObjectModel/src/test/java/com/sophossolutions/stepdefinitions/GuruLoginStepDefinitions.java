package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;
import com.sophossolutions.pages.GuroHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GuruLoginStepDefinitions {
	
	GuroLogin guroLogin;
	GuroHome guroHome;

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
		guroLogin.navegateToUrl(string);
		//guroLogin.open();
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String string, String string2) {
		guroLogin.Login(string, string2);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		guroHome.validateText(string);
	}

}
