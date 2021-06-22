package com.sophossolutions.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sophossolutions.actions.Action;
import com.sophossolutions.pages.GuroLogin;
import com.sophossolutions.pages.GuruHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {
	
	GuroLogin loginGuru;
	GuruHome homeGuru;
	
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) { 
		System.out.println("@Given"); 
		loginGuru.navegateTo(string);
//		loginGuru.open();
	}

	@When("Ingreso nombre de ususario {string} Y password {string}")
	public void ingresoNombreDeUsusarioYPassword(String nombreU, String contrasena) {
		System.out.println("@When"); 
		loginGuru.login(nombreU, contrasena);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String titulo) { 
		System.out.println("@Then"); 
		homeGuru.validateTitle(titulo);
	}

}
