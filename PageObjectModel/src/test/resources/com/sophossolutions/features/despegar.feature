#Author: andres.lopez@sophossolutions.com 

Feature: Buscar vuelos economicos
  Yo como automatizador quiero ingresar a la pagina despegar y buscar vuelos economicos


Scenario Outline: Buscar un vuelos
    Given Quiero acceder a la pagina "https://www.despegar.com.co/"
    When Ingresar el lugar de origen <origen> y destino <destino>
		And  Enviar fecha de Ida y Fecha de Vuelta
		And  Enviar edad del niño <edad> y tipo <clase>
    Then Espero Listar vuelos economicos
Examples: 
    |origen   													   |destino  													 | edad     | clase           	   |
    |"Cali"		 														 |"Bogot"														 | "1 años" |"Economica"        	 | 
#   |"Cali, Valle del Cauca, Colombia"		 |"Medellín, Antioquia, Colombia"		 | "3 años" |"Premium economy"		 | 
# 		|Bucaramanga, Santander, Colombia    |Bogotá, Bogotá D.C., Colombia			 | "6 años" |"Ejecutiva/business"  | 
# 		|Pasto, Nariño, Colombia  					 |Medellín, Antioquia, Colombia			 | "7 años" |"Primera Clase"			 |  
 
