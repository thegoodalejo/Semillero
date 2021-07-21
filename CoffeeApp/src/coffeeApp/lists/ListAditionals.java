package coffeeApp.lists;

import static coffeeApp.constants.DataApp.ADITIONAL_NAMES_LIST;

import java.util.ArrayList;
import java.util.List;

import coffeeApp.aditionals.Aditional;
import coffeeApp.interfaces.ICoffeeList;

public class ListAditionals implements ICoffeeList{

	private List<Aditional> listAditionals =  new ArrayList<Aditional>();
	
	public Aditional getItem(String strAppCode) {
		for(Aditional itemList: listAditionals) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return itemList;
			}
		}
		return null;
	}
	
	@Override
	public void showElements() {
		System.out.println("Aditional available:");
		for(Aditional itemList: listAditionals) {
			itemList.showProduct();
		}
	}

	@Override
	public void initData() {
		for(int i = 0; i < ADITIONAL_NAMES_LIST.length; i++) {
			listAditionals.add( new Aditional(
					Integer.toString(i),
					ADITIONAL_NAMES_LIST[i]
			));
		}
		
	}

	@Override
	public boolean isAvailable(String strAppCode) {
		for(Aditional itemList: listAditionals) {
			if(strAppCode.equals(itemList.getStrAppCode())) {
				return true;
			}
		}
		return false;
	}

}