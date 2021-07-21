package coffeeApp.coffees;

import static coffeeApp.constants.DataApp.CODE_HOT_COFFEE;
import static coffeeApp.constants.DataApp.DELIMITER;
import static coffeeApp.constants.DataApp.MSSG_FINISH;

import coffeeApp.interfaces.IProduct;

public class HotCoffee extends Coffee implements IProduct{

	public HotCoffee(String strAppCode, String strName, String strPreparationMode) {
		super(strName, strPreparationMode);
		setAppCode(strAppCode);
		setStrType("Hot Coffee");
	}
	
	@Override
	public void setAppCode(String strAppCode) {
		this.strAppCode = CODE_HOT_COFFEE + DELIMITER + strAppCode;
	}
	
	@Override
	public void showWithNarrative() {
		if(!isBoolTypeOfConsumption()) {
			System.out.println("\nYour product is a: " + getStrType() );
			showProduct();
			getAditionalCoffe().showWithNarrative();
			System.out.println("Your coffee is HOOOOOT, be very careful");
		}
		System.out.println(MSSG_FINISH);
	}
}
