#Author: julian.espitaleta@sophossolutions.com

Feature: Búsqueda de laptop
  Quiero como automatizador probar la búsqueda de laptop

  
  Scenario: Buscar laptop
    Given Quiero buscar laptop en "https://www.amazon.com"
    When Ingreso "laptop" en la barra de búsqueda y procedo a buscar
    Then Debería ver al menos 2 productos y sus precios que se relacionen con la palabra "laptop"
