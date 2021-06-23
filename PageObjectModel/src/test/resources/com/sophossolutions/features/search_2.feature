#Author: valentina.correa@sophossolutions.com

Feature: Búsqueda de secador profesional
  Quiero como automatizador probar la busqueda de secador profesional

  
  Scenario: Buscar celular
    Given Quiero buscar "celular" en https://www.amazon.com
    When Ingreso "celular" en la barra de busqueda y procedo a buscar
    Then Deberia ver al menos 4 productos y sus precios que se relacionen con la palabra "secador profesional"
