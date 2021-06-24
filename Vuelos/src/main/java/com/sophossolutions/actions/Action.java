package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action
{
	public static void espera()
	{
		try
		{	Thread.sleep(2000);
		}
		catch(Exception e)
		{}
	}
	
	public static void click(WebDriver driver, By elemento)
	{
		driver.findElement(elemento).click();
	}
	
	public static void escribirTexto(WebDriver driver, By elemento, String texto)
	{
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public static void elegirLugar(WebDriver driver, By campo, String lugar, By lista)
	{
		click(driver,campo);
		escribirTexto(driver, campo, lugar);
		click(driver, lista);
		espera();
	}
	
	public static void elegirFecha(WebDriver driver, By calendario, String fecha)
	{
		String fechaSeparada[] =fecha.split("-");
		String a = "(//div[contains(@class,'monthgrid-dates-30')])[1]/div[" + fechaSeparada[0] + "]";
		By dia = By.xpath(a);
		click(driver,calendario);
		espera();
		click(driver, dia);
		espera();
		
	}
	
	public static void editarPasajeros(WebDriver driver, By btnAgregar, Integer cantidad)
	{	
		for(int i = 1; i <= cantidad; i++)
		{
			click(driver, btnAgregar);
			espera();
		}
	}
	
	public static void elegirEdades(WebDriver driver, int cantidad)
	{	int option;
		for(int i = 1; i <= cantidad; i++)
		{
			By select = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[" +(i+2) + "]/div[2]/div/div/select");
			click(driver, select);
			espera();
			option = ((int)(Math.random()*18)) + 1;
			By opcion = null;
			for(int j = 1; j <= 18; j++)
			{
				if(option == j)
				{
					opcion = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[" + (i +2) + "]/div[2]/div/div/select/option[" + j + "]");
					j = 19;
				}
			}
			click(driver, opcion);
			espera();
		}
	}
	
	public static void elegirClase(WebDriver driver, By selectClase, String opcion)
	{	click(driver, selectClase);
		espera();
		By option = null;
		String textOption = "";
		for(int i = 1; i <= 4; i++)
		{	
			option = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[2]/div[2]/div/div/div/select/option[" + i + "]");
			textOption = driver.findElement(option).getText();
			if(textOption.equals(opcion))
			{
				i = 5;
			}
		}
		click(driver, option);
		espera();
		
	}

	public static void navegarUrl(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}

	
}