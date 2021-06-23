#Author: santiago.espinal@sophossolutions.com

Feature: Buscar un producto
  Yo como automatizador quiero buscar un producto
  
  Scenario: Buscar producto
    Given Deseo ir a la pagina de "https://es.aliexpress.com/"
    When Ingreso nombre de producto "Televisor"
    Then Valido que se muestren tres articulos

