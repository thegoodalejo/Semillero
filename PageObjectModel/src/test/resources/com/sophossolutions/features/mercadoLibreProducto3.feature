#Author: Grupo 2 

Feature: Buscar producto uno
  Yo como automatizador quiero ingresar a la pagina mercado libre y buscar un producto
  
  Scenario: Buscar un producto en mercadolibre
    Given Deseo ir a la pagina de "https://www.mercadolibre.com.co/"
    When Ingreso nombre de producto  "guantes" 
    Then Muestro nombre y precio del producto