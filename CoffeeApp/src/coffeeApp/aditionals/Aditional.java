package coffeeApp.aditionals;

import static coffeeApp.constants.DataApp.CODE_ADITIONAL;
import static coffeeApp.constants.DataApp.DELIMITER;

import coffeApp.products.Product;
import coffeeApp.interfaces.IProduct;

public class Aditional extends Product implements IProduct{

	public Aditional(String strAppCode, String strName) {
		super(strName);
		setAppCode(strAppCode);
	}
	
	public String getType() {
		return "Aditional";
	}

	@Override
	public void setAppCode(String strAppCode) {
		this.strAppCode = CODE_ADITIONAL + DELIMITER + strAppCode;
	}

	@Override
	public void showWithNarrative() {
		System.out.println("\tWith additional: " + getStrName());
	}

}
