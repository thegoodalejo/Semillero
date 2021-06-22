package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuroLogin;
import com.sophossolutions.pages.GuruHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	
	GuroLogin loginGuru;
	GuruHome homeGuru;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
	    loginGuru.navegateTo(url); //Se pasa como parametro el url
//	    loginGuru.open(); //llama la etiqueta @DefaultURL en .pages
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUserName, String strPassword) {
		System.out.println("@When");
		loginGuru.login(strUserName, strPassword);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String strTitle) {
		System.out.println("@Then");
		homeGuru.validarTitle(strTitle);
	}

}
