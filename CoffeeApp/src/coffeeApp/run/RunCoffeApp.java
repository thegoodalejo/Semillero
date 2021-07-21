package coffeeApp.run;

import coffeeApp.app.CoffeeAppMachine;
/*
 * Author: Juan Miguel Blanco Medina
 * email: juan.blanco@sophossolutions.com
 * link: https://aloviajero.com/tipos-de-cafe/
 */
public class RunCoffeApp {

	public static void main(String[] args) {
		CoffeeAppMachine AppCoffee = new CoffeeAppMachine();
		AppCoffee.buyCoffee();
		AppCoffee.showPurchase();
	}

}
