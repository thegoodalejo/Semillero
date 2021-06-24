package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.*; 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buscarVuelosStepDefinitions {
	
	DespegarHome busquedaHome; 
	
	@Given("Quiero acceder a la pagina {string}")
	public void quieroAccederALaPagina(String strUrl) {
		busquedaHome.navegateTo(strUrl);
	    
	}

	@When("Ingresar el lugar de origen {string} y destino {string}")
	public void ingresarElLugarDeOrigenYDestino(String strOrigen, String strDestino) {
	  	    
	    busquedaHome.buscar(strOrigen, strDestino);
	}
		
	   
	
	@When("Enviar fecha de Ida y Fecha de Vuelta")
	public void enviarFechaDeIdaYFechaDeVuelta() {
		busquedaHome.selecionarFecha();
	    	   
	}
	
	@When("Enviar edad del niño {string} y tipo {string}")
	public void enviarEdadDelNiñoYTipo(String strEdad, String strTipo) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Espero Listar vuelos economicos")
	public void esperoListarVuelosEconomicos() {

	}

}
