package data;
public class MenuItem{
	private String name;
	private String description;
	private double price;
	private String picturePath;
	private int qnty;
	private String customization;
	private int cookTime;
	
	//- Quantity added to facilitate addToCart function better
	//- Customization String chosen rather than Array of customization. 
	//- Plans to use a TSV format?
	
	// // TODO - MODIFY FUNCTIONALITY TO INCLUDE COOKTIME + CHANGE IN TSV FILE AS WELL
	
	//- Overloaded function for base function / default initialization on menuArrays
	public MenuItem(String name, String desc, String pPath, double price, int qnty) {
		this.name = name;
		this.description = desc;
		this.picturePath = pPath;
		this.price = price;
		this.qnty = qnty;
		this.customization = "";
		this.cookTime = 5;
	}
	
	//- Overloaded function for optional customization
	public MenuItem(String name, String desc, String pPath, double price, int qnty, String custom) {
		this.name = name;
		this.description = desc;
		this.picturePath = pPath;
		this.price = price;
		this.qnty = 0;
		this.customization = custom;
		this.cookTime = 5;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDesc() {
		return this.description;
	}
	
	public double getPrice() {
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
	
	public int getCookTime() {
		return this.cookTime;
	}
	
	public void setQuantity(int newQnty) {
		this.qnty = newQnty;
	}
}