public class MenuItem{
	private String name;
	private String description;
	private double price;
	private String picturePath;
	private int qnty;
	private String customization;
	
	//- Quantity added to facilitate addToCart function better
	//- Customization String chosen rather than Array of customization. 
	//- Plans to use a TSV format?
	
	//- Overloaded function for base function / default initialization on menuArrays
	public MenuItem(String name, String desc, String pPath, double price, int qnty) {
		this.name = name;
		this.description = desc;
		this.picturePath = pPath;
		this.price = price;
		this.qnty = qnty;
		this.customization = "";
	}
	
	//- Overloaded function for optional customization
	public MenuItem(String name, String desc, String pPath, double price, int qnty, String custom) {
		this.name = name;
		this.description = desc;
		this.picturePath = pPath;
		this.price = price;
		this.qnty = 0;
		this.customization = custom;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDesc() {
		return this.description;
	}
	
	public double getDouble() {
		return this.price;
	}
	
	public String getPicPath() {
		return this.picturePath;
	}
	
	public int getQuantity() {
		return this.qnty;
	}
	
	public String getCustomization() {
		return this.customization;
	}
	
	public void setQuantity(int newQnty) {
		this.qnty = newQnty;
	}
}