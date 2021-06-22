package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions
{
	GuruLogin gl;
	
	//@Given("Deseo ingresar a la pagina {string}")
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIngresarALaPagina(String url) {
		System.out.println("@Given");
		gl.navegateTo(url);
		
	}

	@When("ingreso nombre de usurio {string} y contraseña {string}")
	public void ingresoNombreDeUsurioYContraseña(String string, String string2) {
		System.out.println("@Given");
	}

	@Then("valido que el titulo sea {string}")
	public void validoQueElTituloSea(String string) {
		System.out.println("@Given");
	}
}