package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.DespegarSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarSearchStepDefinitions {
	
	DespegarSearch despegarHome;
	
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String url) {
		System.out.println("@Given");
		despegarHome.navegateTo(url);
	}

	@When("Ingreso los datos (.+), (.+), (.+), (.+), (.+), (.+), (.+) y (.+)$")
	public void ingresoLosDatos(String origen, String destino, int ida, int vuelta, int cantAdultos, int cantMenores, String edadMenor, String clase) throws InterruptedException {
		System.out.println("@When");		
		despegarHome.ingresarOrigenYDestino(origen, destino);		
		despegarHome.ingresarIdaYVuelta(ida, vuelta);
		despegarHome.ingresarAdultosYMenores(cantAdultos, cantMenores, edadMenor);
		despegarHome.seleccionarClase(clase);
	}

	@Then("Valido la busqueda")
	public void validoLaBusqueda() {
		System.out.println("@Then");
		despegarHome.mostrarResultados();
		System.out.println("--------------------------");
	}

}
