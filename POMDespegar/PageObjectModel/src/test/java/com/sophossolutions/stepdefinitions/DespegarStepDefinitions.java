package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.BuscarVuelo;
import com.sophossolutions.pages.PreciosVuelos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarStepDefinitions {
	
	BuscarVuelo buscarVuelo;
	PreciosVuelos precioVuelos;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		buscarVuelo.navigateTo(url);
	}
	
	@When("Selecciono origen {string} y destino {string} en fecha de ida en Junio {string} y vuelta en Julio {string}"
			+ " para la clase {string}")
	public void seleccionoOrigenYDestinoEnFechaDeIdaEnJunioYVueltaEnJulioParaLaClase(String strOrigen, String strDestino,
			String strIda, String strVuelta, String strClase) {
		buscarVuelo.ingresarRuta(strOrigen, strDestino);
	    buscarVuelo.seleccionarFecha(strIda, strVuelta);
	    buscarVuelo.selectPasajeros(strClase);
	}

	@Then("busco los vuelos disponibles con sus precios")
	public void buscoLosVuelosDisponiblesConSusPrecios() {
	    precioVuelos.imprimirPrecio();
	}
	
}
