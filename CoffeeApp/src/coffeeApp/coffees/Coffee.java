package coffeeApp.coffees;

import coffeApp.products.Product;
import coffeeApp.aditionals.Aditional;

public abstract class Coffee extends Product{
	
	private String strPreparationMode;
	private String strFormatPreparation = "\nName: %-20s\nPreparation: %50s\n";
	private Aditional aditionalToCoffe = new Aditional("0", "None");
	private String strType = "Hot Coffee";
	// By default I consume already.
	private boolean boolTypeOfConsumption = false;
	
	public Coffee(String strName, String strPreparationMode) {
		super(strName);
		this.strPreparationMode = strPreparationMode;
	}
	
	
	public String getStrType() {
		return strType;
	}
	
	public Aditional getAditionalCoffe() {
		return aditionalToCoffe;
	}
	
	public boolean isBoolTypeOfConsumption() {
		return boolTypeOfConsumption;
	}

	public void setAditionalCoffe(Aditional aditionalToCoffe) {
		this.aditionalToCoffe = aditionalToCoffe;
	}
	
	public void setBoolTypeOfConsumption(boolean boolTypeOfConsumption) {
		this.boolTypeOfConsumption = boolTypeOfConsumption;
	}
	
	public void setStrType(String strType) {
		this.strType =strType;
	}
	
	public String getStrPreparationMode() {
		return strPreparationMode;
	}
	
	public void showPreparationMode() {
		System.out.println(String.format(strFormatPreparation, getStrName(), getStrPreparationMode()));
	}

}
