package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.DespegarHome;
import com.sophossolutions.pages.DespegarResultado;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class busquedaVueloStepDefinitions {
	DespegarHome busquedaHome;
	DespegarResultado resultado;
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String strUrl) {
		busquedaHome.navegateTo(strUrl);
	}
	
	@When("Ingreso el origen (.+), el destino (.+), fecha de ida (.+),fecha de vuelta (.+), numero de mayores de edad (.+), numero de menores edad (.+), edades del menor (.+) y la clase (.+)$")
	public void ingresoElOrigenElDestinoFechaDeIdaFechaDeVueltaNumeroDeMayoresDeEdadNumeroDeMenoresEdadEdadesDelMenorYLaClase(String strOrigen,String strDestino,String strFechaIda, String strFechaVuelta, int numMay, int numMen,String strEdad,String strClase){
		busquedaHome.buscar(strOrigen,strDestino,strFechaIda,strFechaVuelta, numMay,numMen, strEdad, strClase);
	}
	
	/*@When("Ingreso el origen (.+), el destino (.+), fecha de ida (.+),fecha de vuelta (.+), numero de mayores de edad (.+), numero de menores edad (.+), edades del menor (.+) y la clase (.+)")
	public void ingresoElOrigenElDestinoFechaDeIdaJulioFechaDeVueltaNumeroDeMayoresDeEdadNumeroDeMenoresEdadEdadesDelMenorYLaClase(String strOrigen,String strDestino,String strFechaIda, String strFechaVuelta, int numMay, int numMen,int edades,String clase) {
		busquedaHome.buscar(strOrigen,strDestino);
	}*/
	
	@Then("Muestro el resultado de esa busqueda")
	public void muestroElResultadoDeEsaBusqueda() {
		resultado.validateResult();
	}
}
