#Author: valentina.correa@sophossolutions.com
Feature: B�squeda de vuelo
  Quiero como automatizador probar la b�squeda de vuelos en Despegar

  Scenario Outline: Busqueda de vuelo
    Given Quiero buscar en la pagina https://www.despegar.com.co/
    When Ingreso <origen>, <destino>, <fecha_ida>, <fecha_vuelta>, <edad>, <clase>, <adultos> en la barra de busqueda y procedo a buscar
    Then muestra los vuelos disponibles

    Examples: 
      | origen       | destino      | fecha_ida | fecha_vuelta | edad | clase                | adultos |
      | "armenia"    | "cartagena"  | "14"      | "18"         | "4"  | "Premium economy"    | "3"     |
      | "cartagena"  | "armenia"    | "20"      | "24"         | "3"  | "Ejecutiva/Business" | "5"     |
      | "bogota"     | "san andres" | "16"      | "20"         | "8"  | "Economica"          | "3"     |
      | "san andres" | "bogota"     | "25"      | "30"         | "10" | "Primera Clase"      | "4"     |
