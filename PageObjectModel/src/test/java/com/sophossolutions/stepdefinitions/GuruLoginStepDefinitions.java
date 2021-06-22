package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuruHome;
import com.sophossolutions.pages.GuruLogin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	
	GuruLogin guruLogin;
	GuruHome guruHome;
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		System.out.println("@Given");
		guruLogin.navegateTo(url);
		//login.open();
	}

	@When("Ingreso el nombre de usuario {string} y password {string}")
	public void ingresoElNombreDeUsuarioYPassword(String strUser, String strPassword) {
		System.out.println("@When");
		guruLogin.login(strUser, strPassword);
		
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String textHome) {
	    System.out.println("@Then");
	    guruHome.validateText(textHome);
	}


}


