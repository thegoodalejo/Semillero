#Author: angel.vivas@sophossolutions.com

Feature: Iniciar sesion en guru
	Yo como automatizador quiero ingresar a la pagina  guru

	Scenario: Iniciar sesion en Guru
		Given Deseo ir a la pagina de "https://demo.guru99.com/v4/"
		When Ingreso nombre de usuario "mngr335754" y password "AjAjYnu"
		Then Valido que el titulo sea "Manager Id : mngr335754"