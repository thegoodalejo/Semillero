package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonMain;
import com.sophossolutions.pages.AmazonSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {
	
	AmazonMain main;
	AmazonSearchPage results;
	
	@Given("Quiero buscar {string} en https:\\/\\/www.amazon.com")
	public void quieroBuscarEnHttpsWwwAmazonCom(String string) {
	    main.navigateTo("https://www.amazon.com");
	}


	@When("Ingreso {string} en la barra de búsqueda y procedo a buscar")
	public void ingresoEnLaBarraDeBúsquedaYProcedoABuscar(String search) {
	    main.search(search);
	}

	@Then("Debería ver al menos {int} productos y sus precios que se relacionen con la palabra {string}")
	public void deberíaVerAlMenosProductosYSusPreciosQueSeRelacionenConLaPalabra(Integer int1, String string) {
	    results.printResults();
	}
}
