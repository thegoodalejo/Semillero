#Author: angel.vivas@sophossolutions.com
Feature: Realizar 3 busquedas de un vuelos en Despegar
  Yo como automatizador quiero ingresar a la pagina  despegar

  Scenario Outline: Realizar busquedas de vuelos
    Given Deseo ir a la pagina "https://www.despegar.com.co"
    When Ingreso los datos <origen>, <destino>, <ida>, <vuelta>, <cantidadAdultos>, <cantidadMenores>, <edadMenor> y <clase>
    Then Valido la busqueda

    Examples: 
      | origen   | destino   | ida | vuelta | cantidadAdultos | cantidadMenores | edadMenor | clase              |
      | Cucuta   | Bogota    |  28 |     30 |               4 |               1 | 5 años    | Economica          |
      | Medellin | Cartagena |  29 |     30 |               3 |               1 | 3 años    | Economica          |
      | Medellin | Bogota    |  28 |     30 |               2 |               1 | 7 años    | Ejecutiva/Business |
