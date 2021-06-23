package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.AmazonMain;
import com.sophossolutions.pages.AmazonSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {
	
	AmazonMain main;
	AmazonSearchPage results;
	
	@Given("Quiero buscar en la pagina https:\\/\\/www.amazon.com")
	public void quieroBuscarEnLaPaginaHttpsWwwAmazonCom() {
	    main.navigateTo("https://www.amazon.com");
	}
	
	@When("Ingreso celular en la barra de búsqueda y procedo a buscar")
	public void ingresoCelularEnLaBarraDeBusquedaYProcedoABuscar() {
	    // Write code here that turns the phrase above into concrete actions
		main.search("celular");
	}

	@When("Ingreso laptop en la barra de búsqueda y procedo a buscar")
	public void ingresoLaptopEnLaBarraDeBusquedaYProcedoABuscar() {
	    // Write code here that turns the phrase above into concrete actions
		main.search("laptop");
	}
	
	@When("Ingreso joy-con en la barra de búsqueda y procedo a buscar")
	public void ingresoJoyConEnLaBarraDeBusquedaYProcedoABuscar() {
	    // Write code here that turns the phrase above into concrete actions
		main.search("joy-con");
	}


	@Then("Debería ver al menos {int} productos y sus precios")
	public void deberiaVerAlMenosProductosYSusPreciosQueSeRelacionenConLaPalabra(Integer int1) {
	    results.printResults();
	}
}
