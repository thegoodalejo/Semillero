#Author: andres.guarnizo@sophossolutions.com

@tag1
Feature: Realizar Busqueda de producto
  Yo deseo realizar la busqueda de un producto en Amazon

  Scenario: Realizar la busqueda de producto
    Given Deseo ir a la pagina de "https://www.amazon.com/"
    When Ingreso el producto "escritorio"
    Then Imprimo los tres articulos con sus precios