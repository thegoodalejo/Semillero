#Author: elber.ceballos@sophossolutions.com

Feature: Inicio sesion en Guru
  Yo como automatizador quiero ingresar a la pagina Guru

  Scenario: Inicio sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/v4/"
    When Ingreso nombre de usuario "mngr335743" y contraseña "agYtybY"
    Then Validar que el titulo sea "Manger Id : mngr335743w"