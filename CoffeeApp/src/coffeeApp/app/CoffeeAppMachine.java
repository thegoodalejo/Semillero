package coffeeApp.app;

import java.util.Scanner;

import coffeeApp.aditionals.Aditional;
import coffeeApp.coffees.ColdCoffee;
import coffeeApp.coffees.HotCoffee;
import coffeeApp.lists.ListAditionals;
import coffeeApp.lists.ListColdCoffees;
import coffeeApp.lists.ListHotCoffees;

public class CoffeeAppMachine {
	
	private Boolean boolPurchaseCompleted = false;
	private ListHotCoffees listHotCoffees = new ListHotCoffees();
	private ListColdCoffees listColdCoffees = new ListColdCoffees();
	private ListAditionals listAditionals = new ListAditionals();
	private Scanner scanText = new Scanner(System.in);
	
	public CoffeeAppMachine(){
		listHotCoffees.initData();
		listColdCoffees.initData();
		listAditionals.initData();
	}
	
	private void setBoolPurchaseCompleted(Boolean boolPurchaseCompleted) {
		this.boolPurchaseCompleted = boolPurchaseCompleted;
	}
	
	public void buyCoffee() {
		while(!boolPurchaseCompleted) {
			System.out.println("Welcome to the Coffee application");
			listHotCoffees.showElements();
			listColdCoffees.showElements();
			System.out.println("Write the reference of the coffee you want: ");		
			String indexCoffee = scanText.nextLine();
			if (listHotCoffees.isAvailable(indexCoffee)) {
				isAvaliableHotCoffee(listHotCoffees.getItem(indexCoffee));
			} else if (listColdCoffees.isAvailable(indexCoffee)) {
				isAvaliableColdCoffee(listColdCoffees.getItem(indexCoffee));
			} else {
				System.out.println("Type of coffee not found");
			}
			retryShop();
		}
		scanText.close();
	}
	
	private void isAvaliableHotCoffee(HotCoffee selectedCoffee) {
		System.out.println("Selected coffee:");
		selectedCoffee.showProduct();
		selectedCoffee.setAditionalCoffe(selectAditional());
		selectedCoffee.showPreparationMode();
		listHotCoffees.addItemToUserShop(selectedCoffee);
		// Select and write BoolTypeOfConsumption...
		System.out.println("Write y/n if you want the coffee to take away elsewhere");
		String mssgConsumption = scanText.nextLine();
		selectedCoffee.setBoolTypeOfConsumption( mssgConsumption.toLowerCase().equals("y") );
		selectedCoffee.showWithNarrative();
	}
	private void isAvaliableColdCoffee(ColdCoffee selectedCoffee) {
		System.out.println("Selected coffee:");
		selectedCoffee.showProduct();
		selectedCoffee.setAditionalCoffe(selectAditional());
		selectedCoffee.showPreparationMode();
		listColdCoffees.addItemToUserShop(selectedCoffee);
		// Select and write BoolTypeOfConsumption...
		System.out.println("Write y/n if you want the coffee to take away elsewhere");
		String mssgConsumption = scanText.nextLine();
		selectedCoffee.setBoolTypeOfConsumption( mssgConsumption.toLowerCase().equals("y") );
		selectedCoffee.showWithNarrative();
	}

	private void retryShop() {
		System.out.println("Write y / n if you want another coffee");
		String mssgRetry = scanText.nextLine();
		setBoolPurchaseCompleted( !mssgRetry.toLowerCase().equals("y") );
	}
	
	private Aditional selectAditional() {
		listAditionals.showElements();
		System.out.println("Write the reference of the aditional you want: ");
		String indexAditional = scanText.nextLine();
		if(listAditionals.isAvailable(indexAditional)) {
			Aditional selectedAditional = listAditionals.getItem(indexAditional);
			System.out.println("Selected aditional:");
			selectedAditional.showProduct();
			return selectedAditional;
		}
		System.out.println("Type of aditional not found");
		return new Aditional("0", "None");
	}
	
	public void showPurchase() {
		listHotCoffees.showPurchasedItems();
		listColdCoffees.showPurchasedItems();
	}
	
}
