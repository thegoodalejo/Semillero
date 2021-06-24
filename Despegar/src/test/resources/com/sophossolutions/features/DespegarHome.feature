#Author: jonathan.castro@sophossolutions.com
Feature: Buscar vuelo en despegar
  Yo deseo automatizar la busqueda de vuelos en despegar

  Scenario Outline: Buscar vuelo en despegar
    Given Dado que me encuentro en <url>
    When busco un vuelo de <origen> a <destino> con fecha de ida <fechaIda> y fecha de regreso <fechaRegreso> con un niño de <edad>  en clase <clase>
    Then yo obtengo el listado de resultados

    Examples: 
      | url                            | origen                             | destino                            | fechaIda     | fechaRegreso | edad | clase                |
      | "https://www.despegar.com.co/" | "Bogotá, Bogotá D.C., Colombia"    | "Cancún, Quintana Roo, México"     | "2021-06-25" | "2021-07-02" |    7 | "Economica"          |
      | "https://www.despegar.com.co/" | "Bucaramanga, Santander, Colombia" | "Santa Marta, Magdalena, Colombia" | "2021-06-27" | "2021-07-08" |    5 | "Premium economy"    |
      | "https://www.despegar.com.co/" | "Bogotá, Bogotá D.C., Colombia"    | "Berlín, Berlín, Alemania"         | "2021-06-25" | "2021-07-15" |    6 | "Ejecutiva/Business" |
