#Author: santiago.espinal@sophossolutions.com
Feature: Buscar un producto
  Yo como automatizador quiero buscar un producto

  Scenario Outline: Buscar producto
    Given Deseo ir a la pagina de <url>
    When Ingreso nombre de producto <articulo>
    Then Valido que se muestren tres articulos

    Examples: 
      | search         |
      | echo dot 3     |
      | televisor      |
      | asus zenfone 8 |
