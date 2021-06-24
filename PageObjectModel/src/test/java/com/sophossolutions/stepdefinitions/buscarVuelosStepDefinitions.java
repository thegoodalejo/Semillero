package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.*; 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buscarVuelosStepDefinitions {
	
	DespegarHome busquedaHome; 
	DespegarBusqueda listaVuelos; 
	
	@Given("Quiero acceder a la pagina {string}")
	public void quieroAccederALaPagina(String strUrl) {
		busquedaHome.navegateTo(strUrl);
	    
	}

	@When("Ingresar el lugar de origen {string} y destino {string}")
	public void ingresarElLugarDeOrigenYDestino(String strOrigen, String strDestino) {
	  	    
	    busquedaHome.buscar(strOrigen, strDestino);
	}
		
	@When("Enviar fecha de {int} y Fecha de {int}")
	public void enviarFechaDeYFechaDe(Integer ida, Integer regreso) {
		busquedaHome.selecionarFecha( ida, regreso);
	   
	}   
	
	@When("Enviar edad del niño {string} y tipo {string}")
	public void enviarEdadDelNiñoYTipo(String strEdad, String strTipo) {
	    // Write code here that turns the phrase above into concrete actions
		busquedaHome.seleccionarNiños(strEdad);
		busquedaHome.seleccionarClase(strTipo);
	}
	@Then("Espero Listar vuelos economicos")
	public void esperoListarVuelosEconomicos() {
		listaVuelos.vuelosEconomicos();
	}

}
