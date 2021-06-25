package com.despegar.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.despegar.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DespegarResult extends PageObject {
	
	String txtXpathAirline = "//ul[.//span[@class='amount price-amount']]//span[@data-sfa-id='airline-name-matrix']";
	String txtXpathPrices = "//ul[.//span[@class='amount price-amount'] and .//span[contains(text(),'%s')]]//span[@class='amount price-amount']";
	
	
	public void scrollDown() {
		Action.scrollDown(getDriver());
	}

	public void showListPrecios() {
		getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		List<WebElement> listAirlines = getDriver().findElements(By.xpath(txtXpathAirline));
		if (listAirlines.size() > 0) {
			//ArrayList<String> AirlinesToShow = new ArrayList<String>();
			//ArrayList<Integer> pricesToShow = new ArrayList<Integer>();
			for (WebElement Airline : listAirlines) {
				String AirlineName = Airline.getText();
				WebElement Price = getDriver().findElement(By.xpath(String.format(txtXpathPrices,AirlineName)));
				//AirlinesToShow.add(AirlineName);
				//pricesToShow.add(Integer.parseInt(Price.getText().replace(".", "")));
				System.out.println("Aerolinea " + AirlineName + " Vuelo mas economico: " + Price.getText());
			}
		}
		
	}
}
