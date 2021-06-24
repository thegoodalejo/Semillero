package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class DespegarResult extends PageObject {

	
	By TodosLosVuelos = By.xpath("//div[@id='clusters']");
	By Letrero = By.xpath("//h3[@class='eva-3-h3 title-description empty-state-message-title-secondary']");
	By Optionsname = By.xpath("//span[@class='name']");
	By Optionsprice = By.xpath("//span[@class='pricebox-big-text price']");
	
	
	
	public void mostrarVuelos() {
		Action.MostrarPrecioMenor(getDriver(),TodosLosVuelos,Optionsname,Optionsprice,Letrero);
		
	}
}
