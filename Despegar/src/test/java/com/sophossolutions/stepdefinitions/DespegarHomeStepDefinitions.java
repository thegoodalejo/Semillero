package com.sophossolutions.stepdefinitions;

import com.sophossolutions.actions.Action;
import com.sophossolutions.pages.DespegarHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarHomeStepDefinitions {

	 DespegarHome despegarHome;
	 
	 @Given("Dado que me encuentro en {string}")
	 public void dadoQueMeEncuentroEn(String strUrl) {
		 despegarHome.navegarUrl(strUrl);
	 }

	 @When("busco un vuelo de {string} a {string} con fecha de ida {string} y fecha de regreso {string} con un niño de {int}  en clase {string}")
	 public void buscoUnVueloDeAConFechaDeIdaYFechaDeRegresoConUnNiñoDeEnClase(String strOrigen, String strDestino, String strIda, String strRegreso, Integer intEdad,  String strClase) {
		 despegarHome.agregarLugares(strOrigen, strDestino);
		 despegarHome.agregarFechas(strIda, strRegreso);
		 despegarHome.agregarPasajarosYclase(intEdad,strClase);

	 }

	 @Then("yo obtengo el listado de resultados")
	 public void yoObtengoElListadoDeResultados() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

}
