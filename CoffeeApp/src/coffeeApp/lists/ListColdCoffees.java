package coffeeApp.lists;

import static coffeeApp.constants.DataApp.COLD_COFFEE_NAMES_LIST;
import static coffeeApp.constants.DataApp.COLD_COFFEE_PREPARATION_LIST;

import java.util.ArrayList;
import java.util.List;

import coffeeApp.coffees.ColdCoffee;
import coffeeApp.interfaces.ICoffeeList;

public class ListColdCoffees implements ICoffeeList{

	private List<ColdCoffee> listColdCoffees =  new ArrayList<ColdCoffee>();
	private List<ColdCoffee> listColdUserCoffees =  new ArrayList<ColdCoffee>();
	
	public ColdCoffee getItem(String strAppCode) {
		for(ColdCoffee itemList: listColdCoffees) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return itemList;
			}
		}
		return null;
	}
	
	public void addItemToUserShop(ColdCoffee coffeeShop) {
		listColdUserCoffees.add(coffeeShop);
	}
	
	public void showPurchasedItems() {
		if (listColdUserCoffees.size() > 0) {
			System.out.println("Iced coffees bought:");
			for(ColdCoffee itemList: listColdUserCoffees) {
				itemList.showProduct();
				itemList.getAditionalCoffe().showWithNarrative();
			}
		}
	}
	
	@Override
	public void showElements() {
		System.out.println("Iced coffees available:");
		for(ColdCoffee itemList: listColdCoffees) {
			itemList.showProduct();
		}
	}

	@Override
	public void initData() {
		for(int i = 0; i < COLD_COFFEE_NAMES_LIST.length; i++) {
			listColdCoffees.add( new ColdCoffee(
					Integer.toString(i + 1),
					COLD_COFFEE_NAMES_LIST[i],
					COLD_COFFEE_PREPARATION_LIST[i])
			);
		}
		
	}

	@Override
	public boolean isAvailable(String strAppCode) {
		for(ColdCoffee itemList: listColdCoffees) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return true;
			}
		}
		return false;
	}

}
