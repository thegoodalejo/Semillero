#Author: andres.guarnizo@sophossolutions.com

@tag
Feature: Buscar un producto en amazon
  Yo como automatizador quiero seleccionar tres articulos con precio en amazon

  Scenario: Buscar en amazon un producto
    Given Deseo ir a la pagina de "https://www.amazon.com/"
    When Ingreso nombre del producto "escritorio"
    Then Imprimo tres articulos con sus precios