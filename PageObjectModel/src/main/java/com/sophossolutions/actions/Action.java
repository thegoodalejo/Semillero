package com.sophossolutions.actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	public static void navegateToUrl(WebDriver myBrowser, String url) {
		myBrowser.navigate().to(url);
	}
<<<<<<< HEAD

	public static int countElements(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0)
			return myBrowser.findElements(target).size();
		return 0;
	}

	public static void sendData(WebDriver myBrowser, By target, String strData) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).sendKeys(strData);
		}
	}

	public static void clickElement(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).click();
		}
=======
	
	public static void login(
			WebDriver myBrowser,
			By userName, By password, By btnLogin,
			String strUserName, String strPassword) {
		myBrowser.findElement(userName).sendKeys(strUserName);
		myBrowser.findElement(password).sendKeys(strPassword);
		myBrowser.findElement(btnLogin).click();
	}

	public static void validateText(WebDriver driver, By txtHome, String strTextHome) {
		String txtActual = driver.findElement(txtHome).getText();
		assertEquals("El valor esperado es \"" + strTextHome + 
				     "\" es diferente al texto actual: \"" + txtActual +"\"",
				     strTextHome, txtActual);
>>>>>>> 34ed9efcb134bafe357379acd9dc79b6c082ec90
	}
	
	public static void getElementText(WebDriver myBrowser, By target) {
		if (myBrowser.findElements(target).size() > 0) {
			myBrowser.findElement(target).getText();
		}else {
			System.out.println("Missing element: " + target.toString());
		}
	}

	public static void validateText(WebDriver myBrowser, By target, String strTitle) {
		if (myBrowser.findElements(target).size() > 0) {
			String tituloActual = myBrowser.findElement(target).getText();
			assertEquals("El valor esperado: \"" + strTitle + "\", es diferente a: \"" + tituloActual + "\"", strTitle,
					tituloActual);
		}

	}

}
