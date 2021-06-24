#Author: julian.rodriguez@sophossolutions.com
Feature: Realizar busquedae vuelos
  Yo quiero hacer busqueda de vuelos en despegar.com

  Scenario Outline: Realizar busquedae vuelos
    Given Abir la pagina <url>
    When Buscar vuelo para origen <origen> destino <destino> ida <ida> vuelta <vuelta> cantidad adultos <adultos> cantidad ninos <ninos> clase <clase>
    Then Este es el then

    Examples: 
      | url                            | origen        | destino       | ida          | vuelta       | adultos | ninos | clase                |
      | "https://www.despegar.com.co/" | "Bogota"      | "Medellin"    | "24-06-2021" | "25-06-2021" |       1 |     1 | "Economica"          |
      | "https://www.despegar.com.co/" | "Bogota"      | "Pasto"       | "26-06-2021" | "30-06-2021" |       2 |     2 | "Premium economy"    |
      | "https://www.despegar.com.co/" | "Cartagena"   | "Cali"        | "25-06-2021" | "29-06-2021" |       4 |     0 | "Ejecutiva/Business" |
      | "https://www.despegar.com.co/" | "Bucaramanga" | "Santa Marta" | "28-06-2021" | "28-06-2021" |       3 |     2 | "Primera Clase"      |
