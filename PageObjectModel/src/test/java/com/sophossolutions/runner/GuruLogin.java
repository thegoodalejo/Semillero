package com.sophossolutions.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue= "com.sophossolutions.stepdefinitions",
        features="src/test/resources/com/sophossolutions/features/guru_login.feature",
        snippets=SnippetType.CAMELCASE,
        strict = true
        )
public class GuruLogin {
	
}
    

 