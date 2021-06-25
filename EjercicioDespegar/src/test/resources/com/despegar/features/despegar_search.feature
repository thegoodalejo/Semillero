Feature: Buscar un vuelo economico
Ya como automatizador quiero

Scenario Outline: Busqueda vuelo mas economico por empresa
	Given Quiero ir a la pagina "https://www.despegar.com.co" 
	When  para viajar desde <targetOrigen> hasta <targetDestino>
	And   cotizar un viaje con <numAdultos> adultos, <numJov> niños de edades <listAges>
	And   selecionar clase <tipoClase> para el viaje
	Then  verificando los precios menores

    Examples: 
      |targetOrigen |targetDestino  | numAdultos | numJov  | listAges | tipoClase          |
      |Bucaramanga  |Medellin       |     3      |    2    |   2,4    | Economica          |
      |Cali         |Bogota         |     2      |    1    |    1     | Premium economy    |
      |Medellin     |Bucaramanga    |     1      |    0    |    0     | Ejecutiva/Business |
      |Neiva        |Barranquilla   |     3      |    2    |   0,1    | Primera Clase      |
