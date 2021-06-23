package com.sophossolutions.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Action;
import com.sophossolutions.pages.GuroLogin;
import com.sophossolutions.pages.GuruHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {

	GuroLogin loginGuru;
	GuruHome homeGuru;

	@Managed
	WebDriver myBrowser;

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String url) {
		loginGuru.navegateTo(url);
		
		By origen = By.xpath("(//div[contains(@class, 'places-component')])[1]//input[@placeholder=\"Ingresa desde dónde viajas\"]");
		By destino = By.xpath("(//div[contains(@class, 'places-component')])[1]//input[@placeholder=\"Ingresa hacia dónde viajas\"]");
		By fechaIda = By.xpath("(//div[contains(@class, 'dates-component')])[1]//input[@placeholder=\"Ida\"]");
		By fechaVuelta = By.xpath("(//div[contains(@class, 'dates-component')])[1]//input[@placeholder=\"Vuelta\"]");
		By pasajeros = By.xpath("(//div[contains(@class, 'distribution-passengers')])[1]//input");
		
		By targetDateIda = By.xpath("(//div[contains(text(), '10')])[2]");
		By targetDateVuelta = By.xpath("(//div[contains(text(), '19')])[2]");
		
		By addMenor = By.xpath("(//button[@class=\"steppers-icon-right stepper__icon\"])[2]");
		
		By btnAplicar = By.xpath("(//em[@class=\"btn-text\"])[1]");
		By btnBuscar = By.xpath("(//em[@class=\"btn-text\"])[2]");
		
		By autoCompletOrigen = By.xpath("(//div[@class = 'ac-container']//span)[2]");
		By autoCompletDestino = By.xpath("//span[text()='San Andrés, Providencia y Santa Catalina, Archipiélago de San Andrés, Colombia']");
		
		
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Action.clickElement(myBrowser, origen);
		Action.sendData(myBrowser, origen, "Medellín, Antioquia, Colombia");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, autoCompletOrigen);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, destino);
		Action.sendData(myBrowser, destino, "San Andrés, Providencia y Santa Catalina, Archipiélago de San Andrés, Colombia");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, autoCompletOrigen);
		Action.clickElement(myBrowser, fechaIda);
		Action.clickElement(myBrowser, fechaIda);
		Action.clickElement(myBrowser, fechaVuelta);
		Action.clickElement(myBrowser, fechaIda);
		Action.clickElement(myBrowser, targetDateIda);
		Action.clickElement(myBrowser, fechaVuelta);
		Action.clickElement(myBrowser, targetDateVuelta);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, pasajeros);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, addMenor);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement select = myBrowser.findElement(By.xpath("(//select[@class=\"select\"])[1]"));
		
		List<WebElement> options = select.findElements(By.className("select-option"));
		System.out.println(options.size());
		for (WebElement option : options) {
		System.out.println(option.getText());
		if("2 años".equals(option.getText()))
			option.click();
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Action.clickElement(myBrowser, btnAplicar);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.clickElement(myBrowser, btnBuscar);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUserName, String strPassword) {
		System.out.println("@When");
		loginGuru.login(strUserName, strPassword);
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String strTitle) {
		System.out.println("@Then");
		homeGuru.validateTitle(strTitle);
	}

}
