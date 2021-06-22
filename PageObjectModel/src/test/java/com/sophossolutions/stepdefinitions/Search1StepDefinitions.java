package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonMain;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search1StepDefinitions {
	
	AmazonMain main;
	
	@Given("Quiero buscar Joy-Cons en {string}")
	public void quieroBuscarJoyConsEn(String url) {
		main.navigateTo(url);
	}

	@When("Ingreso {string} en la barra de búsqueda y procedo a buscar")
	public void ingresoEnLaBarraDeBúsquedaYProcedoABuscar(String string) {
	    main.typeIntoSearchBar(string);
	    main.search();
	}

	@Then("Debería ver al menos {int} productos y sus precios que se relacionen con la palabra {string}")
	public void deberíaVerAlMenosProductosYSusPreciosQueSeRelacionenConLaPalabra(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
