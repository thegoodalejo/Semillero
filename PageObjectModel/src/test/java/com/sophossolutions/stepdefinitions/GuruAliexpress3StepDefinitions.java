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
	
	

}
