#Author: santiago.espinal@sophossolutions.com

Feature: Buscar un producto
  Yo como automatizador quiero buscar un producto
  
  Scenario Outline: Buscar producto
    Given Deseo ir a la pagina de <url>
    When Ingreso nombre de producto <articulo>
    Then Valido que se muestren tres articulos
    
    Examples:
      |url												| articulo
      |https://es.aliexpress.com/ | echo dot 3

