#Author: maria.cala@sophossolutions.com


Feature: Iniciar sesion en Gur
  Yo como automatizador quiero ingresar a la pagina Guru

  Scenario: Iniciar sesion en Guru 
    Given Deseo ir ala pagina de "http://demo.guru99.com/V4/"
    When Ingreso nombre de usuario "mngr335724" y password "Umynyny"
    Then Valido que el titulo sea "Manger Id : mngr335724"


