#Author: elber.ceballos@sophossolutions.com
Feature: Buscar un vuelo
  Yo como automatizador quiero ingresar a la pagina despegar y buscar un vuelo

  Scenario Outline: Buscar un vuelo en despegar
    Given Deseo ir a la pagina "https://www.despegar.com.co/"
    When Ingreso el origen <origen>, el destino <destino>, fecha de ida <fechaIda>,fecha de vuelta <fechaVuelta>, numero de mayores de edad <numMay>, numero de menores edad <numMen>, edades del menor <edades> y la clase <clase>
    Then Muestro el resultado de esa busqueda

    Examples: 
      | origen                        | destino                                | fechaIda      | fechaVuelta    | numMay | numMen | edades  | clase              |
      | Bogotá, Bogotá D.C., Colombia | Tokio, Tokyo-to, Japón                 | 11-Julio-2021 | 12-Agosto-2021 |      4 |      1 | 12 años | Economica          |
      | Bogotá, Bogotá D.C., Colombia | Madrid, Comunidad de Madrid, España    | 22-Julio-2021 | 15-Agosto-2021 |      2 |      1 | 7 años  | Primera clase      |
      | Bogotá, Bogotá D.C., Colombia | Nueva York, Nueva York, Estados Unidos | 15-Julio-2021 | 23-Agosto-2021 |      5 |      1 | 2 años  | Premium economy    |
      | Bogotá, Bogotá D.C., Colombia | Medellín, Antioquia, Colombia          | 26-Julio-2021 | 17-Agosto-2021 |      3 |      1 | 15 años | Ejecutiva/Business |