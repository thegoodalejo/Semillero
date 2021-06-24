package com.despegar.pages;

import java.util.List;
import org.openqa.selenium.By;
import com.despegar.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DespegarResult extends PageObject {
	
	String xpathPrices =  "//p[@class='item-fare fare-price']//span[@class='amount price-amount']";
	String xpathAirlines = "//span[@class='sub-cluster last']//route[@class='-last-route']//span[@class='name']";
	
	public void scrollDown() {
		Action.scrollDown(getDriver());
	}

	public void showListPrecios() {
		List<WebElement> listArilines = getDriver().findElements(By.xpath(xpathAirlines));
		List<WebElement> listPrices   = getDriver().findElements(By.xpath(xpathPrices));
		// Print list
		/*
		for(WebElement AirLine: listArilines) {
			System.out.println(AirLine.getText());
		}
		
		for(WebElement Price: listPrices) {
			System.out.println(Price.getText());
		}
		*/
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
		
	}

}
