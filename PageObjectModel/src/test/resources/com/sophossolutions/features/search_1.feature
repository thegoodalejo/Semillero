#Author: julian.espitaleta@sophossolutions.com

Feature: Búsqueda de Joycons
  Quiero como automatizador probar la búsqueda de Joycons

  
  Scenario: Buscar Joycon
    Given Quiero buscar Joy-Cons en "https://www.amazon.com"
    When Ingreso "Joy-Con" en la barra de búsqueda y procedo a buscar
    Then Debería ver al menos 2 productos y sus precios que se relacionen con la palabra "Joycon"