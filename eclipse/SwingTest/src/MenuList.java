import java.util.ArrayList;

public class MenuList {
	public ArrayList<MenuItem> appetizerArray;
	public ArrayList<MenuItem> entreeArray;
	public ArrayList<MenuItem> dessertArray;
	public ArrayList<MenuItem> drinkArray;
	public ArrayList<MenuItem> shoppingCart;
	public AccountDatabase accounts;
	
	public void addItem(MenuItem item, String category) {
		if(category.equals("appetizer")) {
			appetizerArray.add(item);
		}else if(category.equals("entree")) {
			entreeArray.add(item);
		}else if(category.equals("dessert")) {
			dessertArray.add(item);
		}else if(category.equals("drink")) {
			drinkArray.add(item);
		}
		//- Invalid: return
		return;
	}
	
	/*public void removeItem(MenuItem item){
		for(int index = 0; index < menuArray.)
	}*/
	
	public void addToCart(MenuItem item, int qnty){
		//- To be used only in Item Description Pop-Ups
		item.setQuantity(qnty);
		shoppingCart.add(item);
	}
	
	public void removeFromCart(int index, int qnty) {
		//- To be used only in Cart List; 
		//- Takes in the index of the ShoppingCart so
		//- a searchArray function isn't required. 
		int itemQnty = shoppingCart.get(index).getQuantity();
		if(qnty >= itemQnty) {
			shoppingCart.remove(index);
		}else {
			int newQnty = itemQnty - qnty;
			shoppingCart.get(index).setQuantity(newQnty);
		}
	}
	
	//- Probably calculated in the GUI
	/*public int placeOrder(PayInfo info) {
		int waitTime = 0;
		for(MenuItem index : shoppingCart) {
			
		}
		return waitTime;
	}*/
}

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

public class AccountDatabase{
	public ArrayList<Account> users;
	
	public AccountDatabase() {
		this.users = [];
	}
	
	public Account lookUpUser(String name) {
		Account index;
		return index;
	}
	
	public boolean verifyPass(String password) {
		boolean valid = false;
		// If password matches, valid = true;
		return valid;
	}	
	
	public void addAccount(Account account) {
		// Used add(int, account) since add(account) returns an integer
		users.add(users.size(), account);
	}
	
	public void removeAccount(Account account) {
		users.remove(account);
	}
}

public class Customer{
	private ContactInfo contactInfo;
	private PayInfo paymentInfo;
	
	public void removeInfo(int Index) {
		
	}
	
	public void setContactInfo(String firstName, String lastName, int ccNumber) {
		
	}
	
	public void setPayInfo() {
		
	}
}