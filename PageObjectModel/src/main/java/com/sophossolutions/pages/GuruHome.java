package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class GuruHome extends PageObject 
{
	By text = By.xpath("//tr[@class='heading3']//td[text()]");
	
	public void validarTitle(String texto) {
		Action.validarTitulo(getDriver(), text, texto);
	}
}
