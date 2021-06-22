#Author: andres.lopez@sophossolutions.com

Feature: Iniciar sesion en Guru
  Yo como automatizador quiero ingresar a la pagina Guru
  
  Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingreso nombre de usuario "mngr335755" y password "tezybUj"
    Then Valido que el titulo sea "Manger Id : mngr335755000"

