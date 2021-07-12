package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.openqa.selenium.By;
import com.sophossolutions.Actions.Actions;
import net.serenitybdd.core.pages.PageObject;

public class GitHubSearchResults extends PageObject {
	
	String txtXpathListLang = "//ul[@class='filter-list small']//li";
	String txtXpathLang = "//a[@class='filter-item']";
	String txtXpathCount = "//span[@class='count']";
	String txtXpathTotalRepos = "//div[@class='d-flex flex-column flex-md-row flex-justify-between border-bottom pb-3 position-relative']//h3";
	// Data Collected. !
	private ArrayList<String> listLanguages = new ArrayList<String>(); 
	private ArrayList<Integer> listCantReposByLang = new ArrayList<Integer>();
	private ArrayList<Integer> listCantReposByLangOfPage = new ArrayList<Integer>();
	private int delayMillis = 1000; 
	
	public ArrayList<String> getListLanguages(){
		return listLanguages;
	}
	
	public ArrayList<Integer> getListCantRepos(){
		return listCantReposByLang;
	}
	
	public ArrayList<Integer> getListCantReposOfPage(){
		return listCantReposByLangOfPage;
	}
	
	public void collectData() throws InterruptedException {
		
		for(int i = 1; i <= Actions.getCantElements(getDriver(),txtXpathListLang); i++) {
			String txtXpathAux = txtXpathListLang + String.format("[%s]", Integer.toString(i));
			String[] dataLang = getDriver().findElement(By.xpath(txtXpathAux+txtXpathLang)).getText().split("\n"); 
			Actions.clickInObject(getDriver(),By.xpath(txtXpathAux));
			Thread.sleep(delayMillis);
			listLanguages.add(dataLang[1]);
			listCantReposByLang.add(Actions.toInt(dataLang[0],","));
			listCantReposByLangOfPage.add(getCantRepoTotal());
			Thread.sleep(delayMillis);
		}
	}
	
	public int getCantRepoTotal() {
		String[] listTotal = getDriver().findElement(By.xpath(txtXpathTotalRepos)).getText().split(" ");
		return Actions.toInt(listTotal[0],",");
	}
	
	public String getDataTable() {
		String tableMssg = "";
		String rowTable = "|%15s|%15s|%15s|\n";
		try {
			for (int i = -1; i < listLanguages.size(); i++) {
				if (i < 0) {
					tableMssg = tableMssg + String.format(rowTable,"Languages","ReposInTable","ReposInPage");
				}else {
					tableMssg = tableMssg + String.format(rowTable,
							listLanguages.get(i),
							listCantReposByLang.get(i).toString(),
							listCantReposByLangOfPage.get(i).toString());
				}
			}
		}catch(Exception e){
			tableMssg = "Error in collected data.";
		}
		return tableMssg;
	}

	public void validateData(Integer totalRepos) {
		//assertEquals(expectedData, resultData)
		assertEquals("Valido que los datos sean iguales",
				totalRepos.toString(),
				Actions.sumList(listCantReposByLangOfPage).toString() );
		for (int i = 0; i < listLanguages.size(); i++) {
				assertEquals("Valido que los datos sean iguales",
						listCantReposByLang.get(i).toString(),
						listCantReposByLangOfPage.get(i).toString() );
		}
	}

}
