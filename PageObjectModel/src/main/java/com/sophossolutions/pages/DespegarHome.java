package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.thucydides.core.pages.PageObject;

public class DespegarHome extends PageObject{
	
	//String xpathFecha="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2021-%s']//div[@class='sbox5-monthgrid-datenumber-number'][text()='%s']";
	String xpathFechaIda="//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[%s]/div";
	String xpathFechaVuelta="//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[%s]/div";
	String xpathClases="//option[@value='%s']";
	//barras
	By barOrigen= By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Ingresa desde dónde viajas']");
	By barDestino=By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
	//botones
	By btnOrigen=By.xpath("/html/body/div[3]/div/div[1]/ul/li");
	By btnDestino=By.xpath("/html/body/div[3]/div/div[1]/ul/li");
	By btnFechaIda=By.xpath("//input[@placeholder='Ida']");
	By btnOtros=By.xpath("//div/div[2]/div[1]/div[1]/div[4]/div/div/div");
	By btnSeleccionarFechaIda;//=By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[29]/div");
	By btnSeleccionarFechaVuelta;
	By selClase=By.xpath("//div[@class='sbox5-3-select-wrapper']");
	By btnMasAdultos=By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
	By btnMasNinos=By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
	By btnEdadMenor=By.xpath("//select[@class='select']");
	By btnAceptarCambios=By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[3]/a");
	By btnBusqueda=By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");
	//otros
	//opciones
	By opClases=By.xpath("//div[@class='sbox5-3-select-wrapper']//option[@class='select-option']");
	By opEdad=By.xpath("//select[@class='select']//option[@value]");
	//By selClase;
	
	
	public void navegateTo(String url) {
		Actions.navegateToUrl(getDriver(), url);
	}
	public void ingresarDatos(String strOrigen,String strDestino,String strFechaIda,String strFechaVuelta) {
		
		//1ro ingresar origen
		Actions.presionarBoton(getDriver(), barOrigen);
		Actions.buscar(getDriver(), barOrigen, strOrigen);
		Actions.presionarBoton(getDriver(), btnOrigen);
		
		//2do ingresar destino
		Actions.presionarBoton(getDriver(), barDestino);
		Actions.buscar(getDriver(), barDestino, strDestino);
		Actions.presionarBoton(getDriver(), btnDestino);
		
		//Ingresar fecha ida
		Actions.presionarBoton(getDriver(),btnFechaIda);
		Actions.presionarBoton(getDriver(),btnFechaIda);
		btnSeleccionarFechaIda=By.xpath(String.format(xpathFechaIda,strFechaIda));
		Actions.presionarBoton(getDriver(),btnSeleccionarFechaIda);
		
		//Ingresar fecha vuelta
		btnSeleccionarFechaVuelta=By.xpath(String.format(xpathFechaVuelta,strFechaVuelta));
		Actions.presionarBoton(getDriver(),btnSeleccionarFechaVuelta);
		
		
	}
	
	public void seleccionarClase(String strClase) {
		//selecionar clase
		Actions.selecciona(getDriver(),btnOtros,selClase,opClases,strClase);
		aceptarCambios();
	}
	
	public void ingresarAdultos(String strCantidad) {
		Actions.presionarBoton(getDriver(),btnOtros);
		Actions.presionarBoton(getDriver(),btnOtros);
		if(strCantidad!="1") {
			for(int i=1;i<Integer.parseInt(strCantidad);i++) {
				Actions.presionarBoton(getDriver(),btnMasAdultos);
				//Actions.esperar(getDriver());
			}
		}
		aceptarCambios();
	}
	
	public void ingresarNinos(String strCantidad) {
		Actions.presionarBoton(getDriver(),btnOtros);
		Actions.presionarBoton(getDriver(),btnOtros);
		if(strCantidad!="0") {
			for(int i=0;i<Integer.parseInt(strCantidad);i++) {
				Actions.presionarBoton(getDriver(),btnMasNinos);
			}
		}
		aceptarCambios();
	}
	public void ingresarEdadNinos(String strEdad) {
		Actions.presionarBoton(getDriver(),btnOtros);
		Actions.presionarBoton(getDriver(),btnOtros);
		Actions.seleccionarCabina(getDriver(), selClase, opEdad, strEdad);
		aceptarCambios();
	}
	public void aceptarCambios() {
		Actions.presionarBoton(getDriver(),btnAceptarCambios);
	}
	public void buscarResultados() {
		Actions.presionarBoton(getDriver(),btnBusqueda);
	}
	

}
