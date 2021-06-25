Feature: Buscar un vuelo economico
Ya como automatizador quiero

Scenario Outline: Busqueda vuelo mas economico por empresa
	Given Quiero ir a la pagina "https://www.despegar.com.co" 
	When  para viajar desde <targetOrigen> hasta <targetDestino>
	And   cotizar un viaje con <numAdultos> adultos, <numJov> niños de edades <listAges>
	Then  verificando los precios menores

    Examples: 
      |targetOrigen |targetDestino | numAdultos | numJov  | listAges |
      |Bucaramanga  |Medellin      |     3      |    2    |   2,4    |
      |Cali         |Bogota        |     2      |    1    |    1     |
      |Medellin     |Bucaramanga   |     1      |    3    |  5,3,10  |
