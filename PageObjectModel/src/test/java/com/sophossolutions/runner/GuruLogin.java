package com.sophossolutions.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = {"stepdefinitions"},
		features = {"src\\test\\resources\\com\\sophossolutions\\features\\guru_login.feature"}
		)
public class GuruLogin {

}
