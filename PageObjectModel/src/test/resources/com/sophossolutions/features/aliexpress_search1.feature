#Author: juan.blanco@sophossolutions.com

Feature: Buscar un producto
  Yo como automatizador quiero buscar un producto
  
  
  Scenario: Buscar producto
    Given Deseo ir a la pagina de "https://es.aliexpress.com/"
    When Ingreso nombre de producto "asus zenfone 8"
    Then Valido que se muestren tres articulos

