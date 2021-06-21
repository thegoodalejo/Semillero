#Author: andres.lopez

@tag
Feature: Iniciar Secion en Guru 
 Yo como automatizador quiero ingresar a la pagina Guru 


  Scenario: Iniciar sesion en Guru 
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4"
    When Ingreso Nombre de Usuario "mngr335755" y password "tezybuj"
    Then I validate the outcomes "Manger Id : mngr335755"


  