import java.util.ArrayList;

public class MenuList {
	public ArrayList<MenuItem> menuArray;
	public ArrayList<MenuItem> shoppingCart;
	public AccountDatabase accounts;
	
	public void addItem(MenuItem newItem) {
		
	}
}

public class MenuItem{
	private String name;
	private String description;
	private double price;
	private String picturePath;
	
	public MenuItem(String name, String desc, String pPath, double price) {
		this.name = name;
		this.description = desc;
		this.picturePath = pPath;
		this.price = price;
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
}

public class AccountDatabase{
	public ArrayList<Account> users;
	
	public AccountDatabase() {
		this.users = [];
	}
	
	
}