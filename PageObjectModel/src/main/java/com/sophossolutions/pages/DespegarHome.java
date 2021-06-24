package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class DespegarHome extends PageObject{

	By origen  = By.xpath("(//input[@placeholder='Ingresa desde dónde viajas'])[1]");
	By destino = By.xpath("(//input[@placeholder='Ingresa hacia dónde viajas'])[1]");
	By idaclic = By.xpath("(//input[@placeholder='Ida'])[1]");
	//By idaDia = By.xpath("(//div[@class='sbox5-monthgrid-datenumber']//div[ text()= 25])[1]");
	By vueltaclic = By.xpath("(//input[@placeholder='Vuelta'])[1]");
	//By VueltaDia = By.xpath("(//div[@class='sbox5-monthgrid-datenumber-number' and text()=14])[2]");
	By CliclPYC = By.xpath("(//div[@class='sbox5-3-input sbox5-3-validation -top-right -lg -icon-left']//input[@placeholder = ''])[1]");
	
	By SumaAdul = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[1]");
	By SumaNiñ = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[2]");
	
	By liv = By.xpath("//li[@class='item -active']");
	By btnBuscar = By.xpath("//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']");
	
	By btnAplicarPYC = By.xpath("//div[@class='stepper__room__footer ']//em[@class='btn-text' and text()='Aplicar']");
	
	
	
	public void BuscarVuelo(String strOrigen, String strDestino) {
		Action.IngresarOrigenDestino(getDriver(), origen,destino,strOrigen, strDestino, liv);
	}
	
	public void BuscarFechas(String txt1, String txt2 ) {
		Action.IngresarFechas(getDriver(), idaclic,vueltaclic,txt1,txt2);
	}
	
	public void IngresarPYC( String adul,String eme, String clas) {
		Action.IngresarPYC(getDriver(), CliclPYC,SumaAdul,SumaNiñ,Integer.parseInt(adul),eme,clas,btnAplicarPYC,btnBuscar);
	}
	
	
	public void navegateTo(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
}
