package com.sophossolutions.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Action;


import net.thucydides.core.pages.PageObject;

public class PrincipalPage extends PageObject{
	By lblCampoOrigen2 = By.xpath("(//div[@class='sbox5-3-input sbox5-3-validation -top-right -lg -icon-left'])[1]");
	By lblCampoOrigen = By.xpath("(//input[@placeholder='Ingresa desde dónde viajas'])[1]");
	By lblCampoDestino = By.xpath("(//input[@placeholder='Ingresa hacia dónde viajas'])[1]");
	By lblCampoFechaIda = By.xpath("(//input[@placeholder='Ida'])[1]");
	By lblCampoPasajeros = By.xpath("(//input[@placeholder='' and @autocomplete='disabled' ])[1]");
	By btnAgregarAdulto = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[1]");
	By btnAgregarMenor = By.xpath("(//button[@class='steppers-icon-right stepper__icon'])[2]");
	By slcEdad = By.xpath("//div[@class='sbox5-select -md']");
	By btnAplicar = By.xpath("//a[@class='sbox5-3-btn -md -primary']");
	By btnBuscar = By.xpath("//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']");
	By slcOrigen = By.xpath("((//ul[@class='ac-group-items'])[1]//child::li)[1]]//span");
	By slcClase = By.xpath("//div[@class='sbox5-cabin-class-select--3cEQw']");
	
	WebDriver driver;
	
	public void navigateTo(String url) {
		Action.navigateToUrl(getDriver(), url);
	}
	
	public By obtenerFecha (String strDia) {

		By slcFecha = By.xpath("//div[@data-month='2021-07']//child::div[--" + strDia + "]");
		
		return slcFecha;
	}
	
	public void obtenerClase (String strClase) {
		
		for (int i=1; i <= 4; i++ ) {
			By element = By.xpath("(//div[@class='select-container'])[2]//child::option["+i+"]");
			if (strClase.equals(Action.obtenerTextoDeElemento(getDriver(), element))) {
				Action.clickElemento(getDriver(), element);
			}
		}
	}
	
	public By obtenerEdad (String srtEdad) {
		
		int edad = Integer.parseInt(srtEdad) + 2;
		
		By slcEdad = By.xpath("//option[@class='select-option'][" + edad + "]");
		
		return slcEdad;
	}


	public void buscarVuelo (String strOrigen, String strDestino, String strfechaIda, String strfechaVuelta, String strEdad, String strClase, String adultos) {
		Action.clickElemento(getDriver(), lblCampoOrigen);
		Action.escribirTexto(getDriver(), lblCampoOrigen, strOrigen);
		try {
			
			Thread.sleep(2000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Action.clickElemento(getDriver(), lblCampoDestino);
			Action.escribirTexto(getDriver(), lblCampoDestino, strDestino);
			
			Thread.sleep(1000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			Action.clickElemento(getDriver(), lblCampoFechaIda);
			
			Thread.sleep(1000);
			
			Action.clickElemento(getDriver(), obtenerFecha(strfechaIda));
			
			Action.clickElemento(getDriver(), obtenerFecha(strfechaVuelta));
			
			Action.clickElemento(getDriver(), lblCampoPasajeros);
			
			Thread.sleep(1000);
			
			for (int i = 1; i < Integer.parseInt(adultos); i++) {
			
				Action.clickElemento(getDriver(), btnAgregarAdulto);
			
			}
			
			Action.clickElemento(getDriver(), btnAgregarMenor);
			
			Action.clickElemento(getDriver(), slcEdad);
			
			Thread.sleep(1000);
			
			Action.clickElemento(getDriver(), obtenerEdad(strEdad));
			
			Action.clickElemento(getDriver(), slcClase);
			
			Thread.sleep(1000);
			
			obtenerClase(strClase);
			
			Action.clickElemento(getDriver(), btnAplicar);
			
			Action.clickElemento(getDriver(), btnBuscar);
			
			By listaEle= By.xpath("//div[@class='col -lg-9 -md-12 -sm-12 results-content-container']");
			
			List<WebElement> listado = getDriver().findElements(listaEle);
			
			for (WebElement elemento : listado) {
				System.out.println(elemento);
			}
			
			Thread.sleep(3000);
			
		} catch ( InterruptedException | AWTException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
	
	}
	
	


}
