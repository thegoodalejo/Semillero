package coffeeApp.lists;

import static coffeeApp.constants.DataApp.HOT_COFFEE_NAMES_LIST;
import static coffeeApp.constants.DataApp.HOT_COFFEE_PREPARATION_LIST;

import java.util.ArrayList;
import java.util.List;

import coffeeApp.coffees.HotCoffee;
import coffeeApp.interfaces.ICoffeeList;

public class ListHotCoffees implements ICoffeeList{

	private List<HotCoffee> listHotCoffees =  new ArrayList<HotCoffee>();
	private List<HotCoffee> listHotUserCoffees =  new ArrayList<HotCoffee>();
	
	public HotCoffee getItem(String strAppCode) {
		for(HotCoffee itemList: listHotCoffees) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return itemList;
			}
		}
		return null;
	}
	
	public void addItemToUserShop(HotCoffee coffeeShop) {
		listHotUserCoffees.add(coffeeShop);
	}
	
	public void showPurchasedItems() {
		if(listHotUserCoffees.size() > 0) {
			System.out.println("Hot coffees bought:");
			for(HotCoffee itemList: listHotUserCoffees) {
				itemList.showProduct();
				itemList.getAditionalCoffe().showWithNarrative();
			}
		}
	}
	
	@Override
	public void showElements() {
		System.out.println("Hot coffees available:");
		for(HotCoffee itemList: listHotCoffees) {
			itemList.showProduct();
		}
	}

	@Override
	public void initData() {
		for(int i = 0; i < HOT_COFFEE_NAMES_LIST.length; i++) {
			listHotCoffees.add( new HotCoffee(
					Integer.toString(i + 1),
					HOT_COFFEE_NAMES_LIST[i],
					HOT_COFFEE_PREPARATION_LIST[i])
			);
		}
		
	}

	@Override
	public boolean isAvailable(String strAppCode) {
		for(HotCoffee itemList: listHotCoffees) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return true;
			}
		}
		return false;
	}

}
