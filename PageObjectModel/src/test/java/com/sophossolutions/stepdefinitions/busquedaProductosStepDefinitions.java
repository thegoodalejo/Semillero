package com.sophossolutions.stepdefinitions;


import com.sophossolutions.pages.DespegarHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class busquedaProductosStepDefinitions {
	
	DespegarHome despegarHome;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
	    despegarHome.navegateTo(url);
	}

	@When("Ingreso origen (.+) destino (.+) fecha de ida (.+) fecha de vuelta (.+) numero de adultos (.+) numero de ninos (.+) y clase (.+)$")
	public void ingresoOrigenDestinoFechaDeIdaFechaDeVueltaNumeroDeAdultosNumeroDeNinosYClase(String strOrigen, String strDestino,String strFechaIda,String strFechaVuelta,String strNumAdultos,String strNumNinos,String strClase) {
		String[] cantNinos=strNumNinos.split(",");
		despegarHome.ingresarDatos(strOrigen,strDestino,strFechaIda,strFechaVuelta);
		despegarHome.seleccionarClase(strClase);
		despegarHome.ingresarAdultos(strNumAdultos);
		despegarHome.ingresarNinos(cantNinos[0]);
		despegarHome.ingresarEdadNinos(cantNinos[1]);
	    
	}
	@Then("Buscar resultados")
	public void buscarresultados() {
		//despegarHome.aceptarCambios();
		despegarHome.buscarResultados();
	}


}
