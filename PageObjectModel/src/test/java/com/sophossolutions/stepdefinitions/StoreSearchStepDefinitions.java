package com.sophossolutions.stepdefinitions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sophossolutions.actions.Action;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class StoreSearchStepDefinitions {

	@Managed
	WebDriver myBrowser;

	@Given("I am in the page (.+)$")
	public void iAmInThePage(String string) {
		Action.navegateToUrl(myBrowser, string);
		Action.clickElement(myBrowser, By.xpath("//img[@class = 'btn-close']"));
	}

	@When("I look on (.+) and (.+) for (.+) items (.+)$")
	public void iLookOnAndFor(String searchBar, String targetSearchButton, String strSearch, int amount) {
		Action.sendData(myBrowser, By.xpath(searchBar), strSearch);
		Action.clickElement(myBrowser, By.xpath(targetSearchButton));
		System.out.println("Buscando " + amount + " Resultados aleatorios...");
	}

	@Then("I verify the (.+) in the (.+)$")
	public void iVerifyThe(String name, String container) {
		System.out.println("En : " + Action.countElements(myBrowser, By.xpath(container)) + " Elementos ...");
		for (WebElement item : myBrowser.findElements(By.xpath(name))) {
			new Actions(myBrowser).moveToElement(item).perform();
			System.out.println(item.getText());
		}
	}
	
	
	
	@Given("I want to write a step$")
	public void iWantToWriteAStep(DataTable data) {
		List<List<String>> info = data.asLists();
		info.get(0).size();
		System.out.println(info.get(0).get(0));
		System.out.println(info.get(0).get(1));
		System.out.println(info.get(0).get(2));
	}

}
