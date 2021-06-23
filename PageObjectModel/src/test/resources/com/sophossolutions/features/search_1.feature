#Author: julian.espitaleta@sophossolutions.com

Feature: Búsqueda de producto
  Quiero como automatizador probar la búsqueda de productos

  
  Scenario Outline: <Search>
    Given Quiero buscar en la pagina <Url>
    When Ingreso <Product> en la barra de búsqueda y procedo a buscar
    Then Debería ver al menos 2 productos y sus precios que se relacionen con la palabra <Product>
    
    Examples:
    	|     Search                |           Url          |    Product    |
    	| Buscar producto en Amazon | https://www.amazon.com |    joy-con    |
    	| Buscar producto en Amazon | https://www.amazon.com |    celular    |
    	| Buscar producto en Amazon | https://www.amazon.com |    laptop     |