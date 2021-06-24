#Author: julian.espitaleta@sophossolutions.com


Feature: Log into Guru
  I wish to automate a login to the Guru webpage

  Scenario: Iniciar Sesion en Guru
    Given I want to login into "http://demo.guru99.com/v4/"
    When I input username "mngr335729" and password "jubAqaz"
    Then I validate the title equals "Manger Id : mngr335729"