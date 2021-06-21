#Author: valentina.correa@sophossolutions.com

Feature: Iniciar sesion en Guru
  Yo como automatizador quiero ingresar a la pagina Guru

  Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingreso nombre de ususario "mngr335761" Y Password "ypUzypE"
    Then Valido que el titulo sea "Manger Id : mngr335761"

