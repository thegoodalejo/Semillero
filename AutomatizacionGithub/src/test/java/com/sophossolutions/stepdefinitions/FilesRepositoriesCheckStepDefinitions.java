package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GitHubHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesRepositoriesCheckStepDefinitions {

	GitHubHome GitHubHomePage;
	
	@Given("Quiero entrar a github {string}")
	public void quieroEntrarAGithub(String url) {
	    GitHubHomePage.navigateTo(url);
	}

	@When("Buscar la cantidad de archivos en el repositorio (.+)$")
	public void buscarLaCantidadDeArchivosEnElRepositorioAngular(String txtRepoName) {
	    GitHubHomePage.iniSearch(txtRepoName);
	}

	@Then("Validar por tipo la cantidad de archivos en el repositorio")
	public void validarPorTipoLaCantidadDeArchivosEnElRepositorio() {
	    System.out.println("Then");
	}
	
}
