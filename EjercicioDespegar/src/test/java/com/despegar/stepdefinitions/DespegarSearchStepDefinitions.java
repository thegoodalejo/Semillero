package com.despegar.stepdefinitions;

import com.despegar.pages.DespegarHome;
import com.despegar.pages.DespegarResult;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DespegarSearchStepDefinitions {
	
	DespegarHome despegarHome;
	DespegarResult despegarResult;
	
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String url) {
		despegarHome.navegateTo(url);
	    
	}
	@When("para viajar desde (.+) hasta (.+)$")
	public void paraViajarDesdeHasta(String strFromCity, String strToCity) {
		despegarHome.writeFromCity(strFromCity);
		despegarHome.writeToCity(strToCity);
		despegarHome.writeDateIni();
		despegarHome.writeDateEnd();
		despegarHome.selectPassengers(1, 2);
		despegarHome.searchTravel();
	}
	
	@Then("verificando los precios menores")
	public void verificandoLosPreciosMenores() {
		despegarResult.scrollDown();
		despegarResult.showListPrecios();
	}
}
