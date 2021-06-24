#Author: andres.lopez@sophossolutions.com
Feature: Buscar vuelos economicos
  Yo como automatizador quiero ingresar a la pagina despegar y buscar vuelos economicos

  Scenario Outline: Buscar un vuelos
    Given Quiero acceder a la pagina "https://www.despegar.com.co/"
    When Ingresar el lugar de origen <origen> y destino <destino>
    And Enviar fecha de <ida> y Fecha de <regreso>
    And Enviar edad del niño <edad> y tipo <clase>
    Then Espero Listar vuelos economicos

    Examples: 
      | origen        | destino    | edad     | clase                | ida | regreso |
      | "Cali"        | "Medellín" | "3 años" | "Premium economy"    |  24 |      25 |
      | "Bucaramanga" | "Bogot"    | "6 años" | "Ejecutiva/business" |  25 |      26 |
      | "Pasto"       | "Medellín" | "7 años" | "Primera Clase"      |  26 |      27 |
      | "Pasto"       | "Cali"     | "7 años" | "Economica"          |  27 |      28 |
