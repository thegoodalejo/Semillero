package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.GitHubHome;
import com.sophossolutions.pages.GitHubSearchResults;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesRepositoriesCheckStepDefinitions {

	GitHubHome GitHubHomePage;
	GitHubSearchResults GitHubSearchResultsPage;
	Integer TotalReposOfPage = 0;
	
	@Given("Quiero entrar a github {string}")
	public void quieroEntrarAGithub(String url) {
	    GitHubHomePage.navigateTo(url);
	}

	@When("Buscar la cantidad de archivos en el repositorio (.+)$")
	public void buscarLaCantidadDeArchivosEnElRepositorioAngular(String txtRepoName) throws InterruptedException {
	    GitHubHomePage.iniSearch(txtRepoName);
	    TotalReposOfPage = GitHubSearchResultsPage.getCantRepoTotal();
	    GitHubSearchResultsPage.collectData();
	}

	@Then("Validar por tipo la cantidad de archivos en el repositorio")
	public void validarPorTipoLaCantidadDeArchivosEnElRepositorio() {
		System.out.println(GitHubSearchResultsPage.getDataTable());
		//GitHubSearchResultsPage.validateData(TotalReposOfPage);
	}
	
}
