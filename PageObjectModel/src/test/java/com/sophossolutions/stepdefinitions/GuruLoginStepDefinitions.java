package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuruHome;
import com.sophossolutions.pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	GuruLogin loginGuru;
	GuruHome homeGuru;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
	    System.out.println("@Given");
	    loginGuru.navegateTo(url);
//    	loginGuru.open();
	}

	@When("Ingreso nombre de usuario {string} y contraseña {string}")
	public void ingresoNombreDeUsuarioYContraseña(String strUserName, String strPassword) {
	    System.out.println("@When");
	    loginGuru.login(strUserName, strPassword);
	}

	@Then("Validar que el titulo sea {string}")
	public void validarQueElTituloSea(String strTitle) {
	    System.out.println("@Then");
	    homeGuru.validateTitle(strTitle);
	}

}
