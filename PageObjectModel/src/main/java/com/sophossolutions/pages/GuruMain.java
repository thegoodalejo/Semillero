package com.sophossolutions.pages;

import net.thucydides.core.pages.PageObject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import com.sophossolutions.actions.Action;

public class GuruMain extends PageObject{
	public By title = By.xpath("//tr[@class='heading3']/td[text()]");
	
	public void validateTitle(String str) {
		assertEquals("El texto esperado no concuerda con el texto actual mostrado:"
				+ "\n\tTexto esperado: "+ str + "\n\t"
						+ "Texto mostrado por aplicativo: " + Action.getElementText(getDriver(), title),
		Action.getElementText(getDriver(), title), 
		str);
	}
}
