package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;

import net.thucydides.core.annotations.locators.WaitForWebElements;

public class Action {
	
	public static void navegateToUrl(WebDriver myBrowser, String url, By btnVuelos) {
		myBrowser.navigate().to(url); 
		myBrowser.findElement(btnVuelos).click();
	}
	
	
	public static void ingresarCiudades(WebDriver myBrowser, By origen, By destino, String strOrigen, String strDestino) throws InterruptedException {

		//Selecciona origen
		myBrowser.findElement(origen).click();
		myBrowser.findElement(origen).sendKeys(strOrigen);
		
		//Obtengo los resultados y selecciono el primero		
		By ul = By.xpath("/html/body/div[3]/div/div/ul");
		WebElement select = myBrowser.findElement(ul);
		List<WebElement> options = select.findElements(By.xpath(("/html/body/div[3]/div/div/ul/li")));		
		options.get(0).click();
		
		//Selecciona destino
		myBrowser.findElement(destino).click();
		myBrowser.findElement(destino).sendKeys(strDestino);
		
		//Obtengo los resultados y selecciono el primero	
		ul = By.xpath("/html/body/div[3]/div/div/ul");
		select = myBrowser.findElement(ul);
		options = select.findElements(By.xpath(("/html/body/div[3]/div/div/ul/li")));	
		options.get(0).click();
	}
	

	public static void ingresarFechas(WebDriver myBrowser, By ida, By vuelta, int diaIda, int diaVuelta) {
		
			//Selecciona ida
			myBrowser.findElement(ida).click();
			
			//Obtengo el calendario de la izquierda
			By gridIzquierda = By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]");
			
			WebElement gridIzq = myBrowser.findElement(gridIzquierda);
			WebElement gridInterna = gridIzq.findElement(By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]"));
			
			List<WebElement> divDias = gridInterna.findElements(By.xpath("//div[@class='sbox5-monthgrid-datenumber-number']"));		
			
			
			for (int i = 0; i < 31; i++) {				
				WebElement divDia = divDias.get(i);				
				String value = divDia.getText();
				
				if(value.equals(String.valueOf(diaIda))) {
					divDia.click();
				}
				if(value.equals(String.valueOf(diaVuelta))) {
					divDia.click();
					break;
				}
			}
	}
	
	
	public static void ingresarCantidadPasajeros(WebDriver myBrowser, By btnPasajeros, By selectEdad, By btnAddAdultos, By btnAddMenores, int cantAdultos, int cantMenores, String strEdad) throws InterruptedException {
		
		myBrowser.findElement(btnPasajeros).click();
		Thread.sleep(2000);
				
		
		for (int i = 1; i < cantAdultos; i++) {
			myBrowser.findElement(btnAddAdultos).click();
		}
		
		for (int i = 0; i < cantMenores; i++) {
			myBrowser.findElement(btnAddMenores).click();
		}
		
        //seleccion edad
		myBrowser.findElement(selectEdad).click();
        WebElement select = myBrowser.findElement(selectEdad);
        Thread.sleep(2000);
 
        List<WebElement> options = select.findElements(By.xpath(("//select[@class='select']//option[@class='select-option']")));
        
        for (WebElement option : options) {
        	if(option.getText().equals(strEdad)) {
        		option.click();
        		break;        		
        	}			
		}	
	}
	
	public static void seleccionarClase(WebDriver myBrowser, By selectClase, By btnAplicar, By btnBuscar, String strClase) throws InterruptedException {
		
		//seleccion clase
		myBrowser.findElement(selectClase).click();
        WebElement select = myBrowser.findElement(selectClase);
        Thread.sleep(1000);
 
        List<WebElement> options = select.findElements(By.xpath(("//select[@class='select-tag']//option[@class='select-option']")));
        
        for (WebElement option : options) {
        	if(option.getText().equals(strClase)) {
        		option.click();
        		break;        		
        	}			
		}	
							
		myBrowser.findElement(btnAplicar).click();
		myBrowser.findElement(btnBuscar).click();
		
		Thread.sleep(10000);		
	}

	public static void mostrarResultados(WebDriver myBrowser, By clusters) {
		
		//Obtengo los clusters
		WebElement wEClusters = myBrowser.findElement(clusters);		
		
		List<WebElement> aerolineasEncontradas = wEClusters.findElements(By.xpath("//*[@id='clusters']/span/div/span/cluster/div/div/div[1]/div/span/div/div[2]/span[1]/route-choice/ul/li/route/itinerary/div/div/div[1]/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span/span[2]/span"));
		List<WebElement> precios = wEClusters.findElements(By.xpath("//*[@id='clusters']/span/div/span/cluster/div/div/div[2]/fare/span/span/fare-details-items/div/item-fare/p/span/flights-price/span/flights-price-element/span/span/em/span[2]"));
		
		System.out.println("Resultados:");
		
		List<String> listAerolineas = new ArrayList<>();
		
		//Iteración de las aerolineas encontradas e imprime sin repetir
		for (int i = 0; i < aerolineasEncontradas.size(); i++) {
			
			String aerolineaName = aerolineasEncontradas.get(i).getText();
			
			if(!existAerolinea(aerolineaName, listAerolineas) && !aerolineaName.equals("")) {
				listAerolineas.add(aerolineaName);
				
				System.out.println("Aerolínea: "+ aerolineaName +" | Precio Final $ " + precios.get(i).getText());
			}
		}				
	}
	
	private static boolean existAerolinea(String aerolineaNameOtra, List<String> list){
		boolean existe = false;
		
		for (String aerolinea : list) {
			if(aerolinea.equals(aerolineaNameOtra)) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}

}
