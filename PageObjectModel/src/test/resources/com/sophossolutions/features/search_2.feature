#Author: valentina.correa@sophossolutions.com

Feature: Búsqueda de secador profesional
  Quiero como automatizador probar la búsqueda de secador profesional

  
  Scenario: Buscar secador profesional
    Given Quiero buscar secador profesional en "https://www.amazon.com"
    When Ingreso "secador profesional" en la barra de búsqueda y procedo a buscar
    Then Debería ver al menos 4 productos y sus precios que se relacionen con la palabra "secador profesional"
