<<<<<<< HEAD
#Author: juan.blanco@sophossolutions.com

Feature: Title of your feature
  Yo como automatizador quiero entrar a la pagina de Guru
 
 # UserID = mngr335753
 # Pass = AgYjYnu
 

  Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingreso el nombre de usuario "mngr335753" y password "AgYjYnu"
    Then Valido que el titulo sea "Manager Id: mngr335753"
=======
#Author: alejandro.orozco@sophossolutions.com

Feature: Iniciar sesion en Guru
  Yo como automatizador quiero ingresar a la pagina Guru
  
  Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingreso nombre de usuario "mngr335002" y password "AvyqEhu"
    Then Valido que el titulo sea "Manger Id : mngr335002"

>>>>>>> 3178b61b3aaa0c744e7714080fa9499cc70d7bce
