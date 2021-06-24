package com.despegar.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.despegar.stepdefinitions",
		features = "src/test/resources/com/despegar/features/despegar_search.feature",
		snippets = SnippetType.CAMELCASE,
		strict = true
		)

public class DespegarSearch {

}