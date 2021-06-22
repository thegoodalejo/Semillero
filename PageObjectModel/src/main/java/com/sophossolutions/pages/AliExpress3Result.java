package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.thucydides.core.pages.PageObject;

public class AliExpress3Result extends PageObject {

	By nombre1 = By.xpath("//div[1][@class='_1OUGS']//div[@class='_2mXVg _89Qo8']//a//span");
	By precio1 = By.xpath("//div[1][@class='_1OUGS']//div[@class='_12A8D']");
	
	
	public void mostrarArticulos() {
		Action.MostrarArticulos(getDriver(),nombre1,precio1);
	}
}
