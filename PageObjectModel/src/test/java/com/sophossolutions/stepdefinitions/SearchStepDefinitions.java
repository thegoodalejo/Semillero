package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonMain;
import com.sophossolutions.pages.AmazonSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {
	
	AmazonMain main;
	AmazonSearchPage results;
	
	@Given("Quiero buscar secador profesional en {string}")
	public void quieroBuscarSecadorProfesionalEn(String url) {
		main.navigateTo(url);
	}
	
	@Given("Quiero buscar laptop en {string}")
	public void quieroBuscarLaptopEn(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Quiero buscar Joy-Cons en {string}")
	public void quieroBuscarJoyConsEn(String url) {
		main.navigateTo(url);
	}

	@When("Ingreso {string} en la barra de búsqueda y procedo a buscar")
	public void ingresoEnLaBarraDeBúsquedaYProcedoABuscar(String search) {
	    main.search(search);
	}

	@Then("Debería ver al menos {int} productos y sus precios que se relacionen con la palabra {string}")
	public void deberíaVerAlMenosProductosYSusPreciosQueSeRelacionenConLaPalabra(Integer int1, String string) {
	    System.out.println(results.searchResults.findElements(null));
	}
}
