package coffeApp.products;

public abstract class Product{
	protected String strAppCode;
	protected String strName;
	private final String strFormatList = "\t|%5s|%20s|";
		
	public Product(String strName) {
		this.strName = strName;
	}

	public String getStrAppCode() {
		return strAppCode;
	}
	
	public String getStrName() {
		return strName;
	}
	
	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	public void showProduct() {
		System.out.println(String.format(strFormatList, getStrAppCode(), getStrName()));
	}

}
