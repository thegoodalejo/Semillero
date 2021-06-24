#Author: andres.guarnizo@sophossolutions.com
@tag
Feature: Title of your feature
  Yo como automatizador quiero ingresar a la pagina despegar y buscar vuelos

  Scenario Outline: Buscar vuelos
    Given Deseo ir a la pagina de "https://www.despegar.com.co/"
    When Selecciono origen <origen> y destino <destino> en fecha de ida en Junio <fIda> y vuelta en Julio <fVuelta> para la clase <clase>
    Then busco los vuelos disponibles con sus precios

    Examples: 
      | origen        | destino     | fIda | fVuelta | clase |
      | "Bogota"      | "Cartagena" | "30" | "11"    | "YC"  |
      | "Bogota"      | "Lima"      | "28" | "13"    | "C"   |
      | "Bucaramanga" | "Bogota"    | "26" | "15"    | "YC"  |
