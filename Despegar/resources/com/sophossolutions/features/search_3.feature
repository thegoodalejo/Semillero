#Author: julian.espitaleta@sophossolutions.com

Feature: Búsqueda de laptop
  Quiero como automatizador probar la busqueda de laptop

  
  Scenario: Buscar laptop
    Given Quiero buscar "laptop" en https://www.amazon.com
    When Ingreso "laptop" en la barra de busqueda y procedo a buscar
    Then Deberia ver al menos 2 productos y sus precios que se relacionen con la palabra "laptop"
