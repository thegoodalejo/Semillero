package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AliExpress3Home;
import com.sophossolutions.pages.AliExpress3Result;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruAliexpress3StepDefinitions {

	AliExpress3Home AliEHome;
	AliExpress3Result AlirResult;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
	    System.out.println("@Given");
	    AliEHome.navegateTo(string);
	}

	@When("Ingreso nombre de producto {string}")
	public void ingresoNombreDeProducto(String string) {
		System.out.println("@When");
		AliEHome.BuscarProducto(string);
	}

	@Then("Valido que se muestren tres articulos")
	public void validoQueSeMuestrenTresArticulos() {
		
		System.out.println("@Then");
		AlirResult.mostrarArticulos();
	}
	
	/*
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
	}*/

}
