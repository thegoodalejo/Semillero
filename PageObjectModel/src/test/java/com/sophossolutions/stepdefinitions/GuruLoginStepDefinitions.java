package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.sophossolutions.pages.GuruLogin;

public class GuruLoginStepDefinitions {
	
	GuruLogin loginguru;
	
	@Given("I want to login into {string}")
	public void iWantToLoginInto(String url) {
	    // Write code here that turns the phrase above into concrete actions
		loginguru.navigateTo(url);
	}

	@When("I input username {string} and password {string}")
	public void iInputUsernameAndPassword(String user, String psw) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@When");
	}

	@Then("I validate the title equals {string}")
	public void iValidateTheTitleEquals(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@Then");
	}
}
