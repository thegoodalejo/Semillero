package com.despegar.pages;

import java.util.List;
import org.openqa.selenium.By;
import com.despegar.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DespegarResult extends PageObject {
	
	String xpathPrices =  "//div[@class='matrix-airlines-container matrix-airlines-container-2']//ul//span[@class='amount price-amount']";
	String xpathAirlines = "//div[@class='matrix-airlines-container matrix-airlines-container-2']//ul//span[@data-sfa-id]";
	
	public void scrollDown() {
		Action.scrollDown(getDriver());
	}

	public void showListPrecios() {
		
		By ObjAriLines = By.xpath(xpathAirlines);
		By ObjPrices = By.xpath(xpathPrices);
		Action.waitForElement(getDriver(), ObjAriLines, 30);
		Action.waitForElement(getDriver(), ObjPrices, 30);
		List<WebElement> listArilines = getDriver().findElements(ObjAriLines);
		List<WebElement> listPrices   = getDriver().findElements(ObjPrices);
		// Print list
		
		for(WebElement AirLine: listArilines) {
			System.out.println(AirLine.getText());
		}
		
		for(WebElement Price: listPrices) {
			System.out.println(Price.getText());
		}
		/*
		if( listArilines.size() == listPrices.size()) {
			int tamList = listArilines.size(), indMenor = 0;
			float menor = Float.parseFloat(listPrices.get(indMenor).getText().replace(".", ""));
			for (int i = 0; i < tamList; i++) {
				float priceAtc = Float.parseFloat(listPrices.get(i).getText().replace(".", ""));
				if (priceAtc < menor) {
					indMenor = i;
				}
				System.out.println("Empresa: " + listArilines.get(i).getText() +
						" Precio: " + priceAtc);
			}
			System.out.println("La empresa ma economica es: " + listArilines.get(indMenor).getText() +
					" con su precio: " + Float.parseFloat(listPrices.get(indMenor).getText().replace(".", ""))
					);
		}
		*/
	}

}
