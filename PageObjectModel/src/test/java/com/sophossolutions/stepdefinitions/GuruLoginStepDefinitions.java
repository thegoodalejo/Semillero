package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GuruLoginStepDefinitions {
	@Given("Deseo ir a la pagina de {string}")
	public void deseo_ir_a_la_pagina_de(String string) {

		System.out.println("@Given");
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingreso_nombre_de_usuario_y_password(String string, String string2) {
		System.out.println("@When");
	}

	@Then("Valido que el tiitulo sea {string}")
	public void valido_que_el_tiitulo_sea(String string) {
		System.out.println("@Then");
	}

}
