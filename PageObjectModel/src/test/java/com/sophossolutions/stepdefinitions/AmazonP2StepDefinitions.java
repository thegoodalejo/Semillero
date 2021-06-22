package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonP2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonP2StepDefinitions {
	
	AmazonP2 amazonP2;

	@Given("Deseo ir a la pagina de {string}")
	public void Deseo_ir_a_la_pagina_de(String string) {
		amazonP2.open();
	}
	
	@When("Ingreso el producto {string}")
	public void ingreso_el_producto(String string) {
	    amazonP2.Buscar(string);
	}

	@Then("Valido que el producto uno con {string}, el producto dos con {string} y el producto tres con {string} se encuentren en los resultados de la busqueda")
	public void valido_que_el_producto_uno_con_el_producto_dos_con_y_el_producto_tres_con_se_encuentren_en_los_resultados_de_la_busqueda(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
