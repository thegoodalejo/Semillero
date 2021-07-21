package coffeeApp.coffees;

import static coffeeApp.constants.DataApp.CODE_COLD_COFFEE;
import static coffeeApp.constants.DataApp.DELIMITER;
import static coffeeApp.constants.DataApp.MSSG_FINISH;

import coffeeApp.interfaces.IProduct;

public class ColdCoffee extends Coffee implements IProduct {
		
	public ColdCoffee(String strAppCode, String strName, String strPreparationMode) {
		super(strName, strPreparationMode);
		setAppCode(strAppCode);
		setStrType("Cold Coffee");
	}
	
	@Override
	public void setAppCode(String strAppCode) {
		this.strAppCode = CODE_COLD_COFFEE + DELIMITER + strAppCode;
	}

	@Override
	public void showWithNarrative() {
		System.out.println("\nYour product is a: " + getStrType() );
		showProduct();
		System.out.println(MSSG_FINISH);
	}
}
