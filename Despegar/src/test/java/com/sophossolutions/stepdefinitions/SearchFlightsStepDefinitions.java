package com.sophossolutions.stepdefinitions;

import java.util.List;

import com.sophossolutions.pages.DespegarMain;
import com.sophossolutions.pages.FlightsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlightsStepDefinitions {
	
	DespegarMain dm;
	FlightsPage fp;
	
	@Given("Search main page of the website https:\\/\\/www.despegar.com.co")
	public void searchMainPageOfTheWebsiteHttpsWwwDespegarComCo() {
	    dm.openBrowser();
	    System.out.println("------------------------------\n");
	}

	@When("Input {string} as origin and {string} as destination")
	public void inputAsOriginAndAsDestination(String originCity, String destinationCity) {
	    dm.inputOriginCity(originCity);
	    dm.inputDestinationCity(destinationCity);
	}

	@When("Input {string} as departure date and {string} as return date")
	public void inputAsDepartureDateAndAsReturnDate(String depDate, String retDate) {
	    dm.inputDates(depDate, retDate);
	}
	
	@When("Select {int} adults and {int} children with ages")
	public void selectAdultsAndChildrenWithAges(Integer numAdults, Integer numChildren, List<Integer> flyerAges) {
	    dm.inputFlyers(numAdults, numChildren, flyerAges);
	}
	
	@Then("Print cheapest flight from each airline in the console")
	public void printCheapestFlightFromEachAirlineInTheConsole() {
		System.out.println("Form submitted\n");
		dm.submitEverything();
		fp.waitForLoad();
		fp.printLowestCostTicketsPerAirline();
		System.out.println("------------------------------\n");
	}
}
