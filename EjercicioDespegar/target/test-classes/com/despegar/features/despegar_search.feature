Feature: Buscar un vuelo economico
Ya como automatizador quiero

Scenario Outline: Busqueda vuelo mas economico por empresa
	Given Quiero ir a la pagina "https://www.despegar.com.co" 
	When  para viajar desde <targetOrigen> hasta <targetDestino>  
	Then verificando los precios menores

    Examples: 
      |targetOrigen |targetDestino |
      |Bucaramanga  |Medellin      |
      |Cali         |Bogota        |
      |Medellin     |Bucaramanga   |
