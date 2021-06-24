package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.PrincipalPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VueloStepDefinitios {
	
	PrincipalPage pagePrincipal;
	
	@Given("Quiero buscar en la pagina (.+)$")
	public void quieroBuscarEnLaPaginaHttpsWwwDespegarComCo(String strUrl) {
		pagePrincipal.navigateTo(strUrl);
	}

	@When("Ingreso {string}, {string}, {string}, {string}, {string}, {string}, {string} en la barra de busqueda y procedo a buscar")
	public void ingresoEnLaBarraDeBusquedaYProcedoABuscar(String strOrigen, String strDestino, String strFechaIda, String strFechaVuelta, String strEdad, String strClase, String strAdultos) {
		pagePrincipal.buscarVuelo(strOrigen, strDestino, strFechaIda, strFechaVuelta, strEdad, strClase, strAdultos);
	}

	@Then("muestra los vuelos disponibles")
	public void muestraLosVuelosDisponibles() {
	}
	
}
