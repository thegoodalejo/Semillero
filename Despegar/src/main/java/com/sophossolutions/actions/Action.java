package com.sophossolutions.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ibm.icu.impl.duration.TimeUnit;


public class Action {
	
	
	//Navegar Url
	public static void navegarUrl(WebDriver driver, String strUrl) {
		driver.navigate().to(strUrl);
	}
	
	//Metodo para agregar lugares
	public static void agregarLugares(WebDriver driver, 
			By byOrigen, By byDestino, By byItemActivo,
			String strOrigen, String strDestino) {

		driver.findElement(byOrigen).click();
		driver.findElement(byOrigen).sendKeys(strOrigen);
		driver.findElement(byItemActivo).click();
		driver.findElement(byDestino).click();
		driver.findElement(byDestino).sendKeys(strDestino);
		driver.findElement(byItemActivo).click();
		
	}
	
	//Metodo para agregar Fechas
	public static void agregarFechas(WebDriver driver,
			By byBtnFecha, By byBtnAplicar,
			String strIda, String strRegreso) {
		try {
			
			String[] strFechaIda = strIda.split("-");
			String[] strFechaRegreso = strRegreso.split("-");

			driver.findElement(byBtnFecha).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(@class,'monthgrid-dates-30')])[1]/div["+ strFechaIda[2]+"]")).click();
			driver.findElement(By.xpath("(//div[contains(@class,'monthgrid-dates-31')])[1]/div["+ strFechaRegreso[2]+"]")).click();
			driver.findElement(byBtnAplicar).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Agregar pasajeros y clase
	public static void agregarPasajerosYclase(WebDriver driver,
			By byBtnPersonas, By byInputPersona, By byInputNinos, 
			String strClase) {
		
		try {
				
				driver.findElement(byBtnPersonas).click();
				Thread.sleep(2000);
				driver.findElement(byInputPersona).click();
				driver.findElement(byInputPersona).click();
				driver.findElement(byInputNinos).click();
				Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	
	//Agregar Edad
	public static void agregarEdadNino(WebDriver driver, 
			By bySelect, By byOpciones, 
			Integer intEdad) {
		
		String strEdad = intEdad + " años" ;
		
		WebElement select = driver.findElement(bySelect);
		List<WebElement> opciones = select.findElements(byOpciones);
		
		for(WebElement opcion: opciones) {
			if(opcion.getText().equals(strEdad)){
				opcion.click();
				break;
			}
		}
	}

	//Agregar clase
	public static void agregarClase(WebDriver driver, 
			By bySelectClase, By byOpcionesClase, By byBtnBuscar, 
			String strClase) {	
		
		try {
			WebElement select = driver.findElement(bySelectClase);
			List<WebElement> opciones = select.findElements(byOpcionesClase);
		
			for(WebElement opcion: opciones) {
				if(opcion.getText().equals(strClase)){
					opcion.click();
					break;
				}
			}
			
			driver.findElement(byBtnBuscar).click();
			Thread.sleep(20000);
			} 
	  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	  		}		
		
	}


	// Mostrar Resultados
	/*public static void mostrarResultados(WebDriver driver, 
			By byAerolineas, By byOpcionesAerolineas) {

		try {
			Thread.sleep(20000);
			WebElement select = driver.findElement(byAerolineas);
			List<WebElement> opciones = select.findElements(byOpcionesAerolineas);
			
			int numeroAerolinea=1;
			
			for(WebElement opcion: opciones) {
				System.out.println(By.xpath("Nombre: "+ driver.findElement(By.xpath("//div[@class='matrix-airlines-container matrix-airlines-container-2']//airlines-matrix-airline//div[@class='airline-name']["+numeroAerolinea+"]")).getText()));
				numeroAerolinea ++;
			}
			
			Thread.sleep(20000);
			} 
	  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	  		}	
		
	}*/
	
	
	

	
}


