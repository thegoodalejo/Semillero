package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.sophossolutions.pages.*;

public class GuruLoginStepDefinitions {
	
	GuruLogin loginGuru;
	GuruMain main;
	
	@Given("I want to login into {string}")
	public void iWantToLoginInto(String url) {
	    // Write code here that turns the phrase above into concrete actions
		loginGuru.navigateTo(url);
	}

	@When("I input username {string} and password {string}")
	public void iInputUsernameAndPassword(String user, String psw) {
	    // Write code here that turns the phrase above into concrete actions
		loginGuru.login(user, psw);
	}

	@Then("I validate the title equals {string}")
	public void iValidateTheTitleEquals(String string) {
	    // Write code here that turns the phrase above into concrete actions
		main.validateTitle(string);
	}
}
