package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.DespegarHome;
import com.sophossolutions.pages.DespegarResult;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;

public class DespegarpagStepDefinitions {
	
	DespegarHome Despegarhome;
	DespegarResult Despegarresult;
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
		Despegarhome.navegateTo(string);
	}

	@When("Ingreso el origen (.+) y el destino (.+) con fecha1 (.+) fecha2 (.+) adultos (.+) edad menor (.+) y clase (.+)$")
	public void ingresoElOrigenMedellinYElDestinoBogotá(String orig, String Des,String txt1, String txt2, String adul,String eme, String clas  ) {
		Despegarhome.BuscarVuelo(orig, Des);
		Despegarhome.BuscarFechas(txt1,txt2);
		Despegarhome.IngresarPYC(adul,eme,clas);
		
	}

	@Then("Valido que se muestren los vuelos de mas baratos")
	public void validoQueSeMuestrenLosVuelosDeMasBaratos() {
		Despegarresult.mostrarVuelos();
	    System.out.println("@Then<");
	}

	

}
