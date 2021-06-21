#Author: julian.rodriguez@sophossolutions.com
@tag
Feature: Title of your feature
	Yo como automatizador quiero ingresar a pagina Guru


# UserID = mngr335758
# Pass = aqEdybe

	Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4"
    When Ingreso el nombre de usuario "mngr335758" y password "aqEdybe"
    Then Valido que el titulo sea "Manager Id: mngr335758"    
