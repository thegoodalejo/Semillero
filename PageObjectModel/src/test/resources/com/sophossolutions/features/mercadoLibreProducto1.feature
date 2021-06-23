#Author: Grupo 2 

Feature: Buscar productos uno
  Yo como automatizador quiero ingresar a la pagina mercado libre y buscar un producto
  
  Scenario Outline: Buscar un producto en mercadolibre
    Given Deseo ir a la pagina <url>
    When Ingreso nombre de producto <elemento>  
    Then Muestro nombre y precio del producto <numero>
    
    Examples:

			|url   													    |elemento 	 		 |numero      |
      |"https://www.mercadolibre.com.co/" |raqueta 		 		 |"1,3,7"  		|
      |"https://www.mercadolibre.com.co/" |balon 					 |"1,3,7"  		|
      |"https://www.mercadolibre.com.co/" |guantes 				 |"1,3,7" 		|