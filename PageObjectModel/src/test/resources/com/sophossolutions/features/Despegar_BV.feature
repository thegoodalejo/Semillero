#Author: santiago.espinal@sophossolutions.com
Feature: Buscar un vuelo
  Yo como automatizador quiero buscar un vuelo

  Scenario Outline: Buscar un vuelo
    Given Deseo ir a la pagina de "https://www.despegar.com.co/"
    When Ingreso el origen <origen> y el destino <destino> con fecha1 <f1> fecha2 <f2> adultos <adult> edad menor <EdM> y clase <clase>
    Then Valido que se muestren los vuelos de mas baratos

    Examples: 
      | origen                                 | destino                        | f1 | f2 | adult | EdM     | clase              |
      | Medellín, Antioquia, Colombia          | Bogotá, Bogotá D.C., Colombia  | 25 | 14 |     3 | 3 años  | Economica          |
      | Bogotá, Bogotá D.C., Colombia          | Riohacha, La Guajira, Colombia | 26 | 15 |     4 | 9 años  | Premium economy    |
      | Cartagena de Indias, Bolívar, Colombia | Manizales, Caldas, Colombia    | 27 | 16 |     2 | 12 años | Ejecutiva/Business |
      | Medellín, Antioquia, Colombia          | Leticia, Amazonas, Colombia    | 28 | 17 |     6 | 16 años | Primera Clase      |
