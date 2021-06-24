package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.DespegarInicio;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarStepDefinition
{	
	DespegarInicio despegar;
	
	@Given("Abir la pagina {string}")
	public void abirLaPagina(String string)
	{	System.out.println("Este es el @GIVEN");
		despegar.pagina(string);
		//despegar.open();
	}

	@When("Buscar vuelo para origen {string} destino {string} ida {string} vuelta {string} cantidad adultos {int} cantidad ninos {int} clase {string}")
	public void buscarVueloParaOrigenDestinoIdaVueltaCantidadAdultosCantidadNinosClase(String oregen,
			String destino, String ida, String vuelta, Integer adultos, Integer ninos, String clase)
	{
		System.out.println("Este es el @WHEN");
		despegar.escribir(oregen, destino, ida, vuelta, adultos, ninos, clase);
		
	}

	@Then("Este es el then")
	public void esteEsElThen() 
	{
		System.out.println("Este es el @TEN");
	}
}