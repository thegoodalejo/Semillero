package com.sophossolutions.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Action {

	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}

	public static void IngresarOrigenDestino(WebDriver myBrowser, By origen, By destino, String ori, String des,
			By liv) {
		myBrowser.findElement(origen).click();
		myBrowser.findElement(origen).sendKeys(ori);
		myBrowser.findElement(origen).click();
		myBrowser.findElement(origen).click();
		myBrowser.findElement(origen).click();
		myBrowser.findElement(liv).click();
		myBrowser.findElement(destino).click();
		myBrowser.findElement(destino).sendKeys(des);
		myBrowser.findElement(destino).click();
		myBrowser.findElement(destino).click();
		myBrowser.findElement(destino).click();
		myBrowser.findElement(liv).click();

	}

	public static void IngresarFechas(WebDriver myBrowser, By ida, By vuel, String txt1, String txt2) {
		String title = "(//div[@class='sbox5-monthgrid-datenumber']//div[ text()= '%s'])[1]";
		By idad = By.xpath(String.format(title, txt1));;
		String title2 = "(//div[@class='sbox5-monthgrid-datenumber-number' and text()='%s'])[2]";
		By vueld= By.xpath(String.format(title2, txt2));
		myBrowser.findElement(ida).click();
		myBrowser.findElement(vuel).click();
		myBrowser.findElement(ida).click();
		myBrowser.findElement(idad).click();
		myBrowser.findElement(vuel).click();
		myBrowser.findElement(vueld).click();

	}

	public static void IngresarPYC(WebDriver myBrowser, By Cliclpyc, By SumaAdul, By SumaNiñ, int Nadul, String eme, String clas, By btnaplicar, By btnBuscar) {
		myBrowser.findElement(Cliclpyc).click();
		myBrowser.findElement(Cliclpyc).click();
		int aux = 0;
		while (aux != Nadul) {
			myBrowser.findElement(SumaAdul).click();
			aux++;
		}
		myBrowser.findElement(SumaNiñ).click();

		WebElement select = myBrowser.findElement(By.xpath("//select[@class='select']"));
		List<WebElement> options = select.findElements(By.xpath("//option[@class='select-option']"));

		for (WebElement opt : options) {

			if (eme.equals(opt.getText())) {
				opt.click();
				break;
			}
		}
		WebElement select2 = myBrowser.findElement(By.xpath("//select[@class='select-tag']"));
		List<WebElement> options2 = select2.findElements(By.xpath("//option[@class='select-option']"));

		for (WebElement opt : options2) {

			if (clas.equals(opt.getText())) {
				opt.click();
				break;
			}
		}
		myBrowser.findElement(btnaplicar).click();
		myBrowser.findElement(btnBuscar).click();

		// myBrowser.manage().wait(2000);

	}

	public static void MostrarPrecioMenor(WebDriver myBrowser, By Todosv, By optN, By optP) {

		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		JavascriptExecutor js = (JavascriptExecutor) myBrowser;
		for (int i = 10; i <= 100; i += 10)
			js.executeScript("window.scrollTo(" + (i - 10) / 100.0 + "*document.body.scrollHeight," + i / 100.0
					+ "*document.body.scrollHeight) ");
		WebElement select = myBrowser.findElement(Todosv);
		List<WebElement> options1 = select.findElements(optN);
		List<WebElement> options2 = select.findElements(optP);

		System.out.println(options1.size());
		System.out.println("-------------------");
		System.out.println(options2.size());
		int len = options1.size();
		Map<String, Double> map = new HashMap<String, Double>();
		
		for (int i = 0 ; i < len; i++) {
			
			if(map.containsKey(options1.get(i).getText())){
				double aux = Double.parseDouble(options2.get(i).getText());
				if( aux < map.get(options1.get(i).getText()) ){
					map.remove(map.get(options1.get(i).getText()));
					map.put(options1.get(i).getText(), aux);
					
				}
			}else {
				map.put(options1.get(i).getText(), Double.parseDouble(options2.get(i).getText()));
			}
			
		}
		
		
		for (String key: map.keySet()){
			System.out.println("Nombre de la aerolínea: " + key);
			System.out.println("Precio menor: " + map.get(key));
		} 
		

	}

}
