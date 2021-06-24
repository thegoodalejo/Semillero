package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.despegar.com.co/")
public class DespegarInicio extends PageObject
{
	By textOrigen = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[contains(@placeholder, 'desde')]");
	By textDestino = By.xpath("//div[@class='sbox5-segment--2_IQ3' and .//span[text()='Tramo 1']]//input[contains(@placeholder, 'hacia')]");
	By listLugares = By.xpath("//div[@class='ac-wrapper -desktop -show']//ul/li");
	
	By textIda = By.xpath("//input[contains(@placeholder, 'Ida')]");
	By textVuelta = By.xpath("//input[contains(@placeholder, 'Vuelta')]");
	//By listFecha = null;
	
	By textPasajeros = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
	By btnAdulto = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
	By btnNino = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
	By listClase = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[2]/div[2]/div/div/div/select");
	By BtnAplicar = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[3]/a");
	
	By BtnBuscar = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");
	
	public void pagina(String url)
	{
		Action.navegarUrl(getDriver(), url);
	}
	
	public void escribir(String oregen,	String destino, String ida, String vuelta, Integer adultos,
			Integer ninos, String clase)
	{
		if(adultos < 1 || ninos < 1)
		{
			System.out.println("\n NO HAY ADULTOS O NIÑOS QUE SE VAN A REGISTRAR POR LO TANTO NO SE PUEDE BUSCAR VUELOS \n");
		}
		else
		{
			Action.elegirLugar(getDriver(), textOrigen, oregen, listLugares);
			Action.elegirLugar(getDriver(), textDestino, destino, listLugares);
			
			Action.elegirFecha(getDriver(), textIda, ida);
			Action.elegirFecha(getDriver(), textVuelta, vuelta);
			
			Action.click(getDriver(), textPasajeros);
			Action.espera();
			if(adultos > 1)
			{
				Action.editarPasajeros(getDriver(), btnAdulto, adultos - 1);
			}
			Action.editarPasajeros(getDriver(), btnNino, ninos);
			Action.elegirEdades(getDriver(), ninos);
			Action.elegirClase(getDriver(), listClase, clase);
			
			Action.click(getDriver(), BtnBuscar);
		}
		
	}
}