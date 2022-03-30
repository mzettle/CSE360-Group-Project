package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MenuList {
	public ArrayList<MenuItem> appetizerArray;
	public ArrayList<MenuItem> entreeArray;
	public ArrayList<MenuItem> dessertArray;
	public ArrayList<MenuItem> drinkArray;
	public ArrayList<MenuItem> shoppingCart;
//	public AccountDatabase accounts; //probably not needed here, can be separated from menulist
	
	public MenuList() {
		appetizerArray = new ArrayList<MenuItem>();
		entreeArray = new ArrayList<MenuItem>();
		dessertArray = new ArrayList<MenuItem>();
		drinkArray = new ArrayList<MenuItem>();
		shoppingCart = new ArrayList<MenuItem>();
	}
	
	public boolean addItem(MenuItem item, String category) {
		if(category.equals("appetizer")) {
			appetizerArray.add(item);
			return true;
		}else if(category.equals("entree")) {
			entreeArray.add(item);
			return true;
		}else if(category.equals("dessert")) {
			dessertArray.add(item);
			return true;
		}else if(category.equals("drink")) {
			drinkArray.add(item);
			return true;
		}
		//- Invalid: return
		return false;
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
	
	public boolean readFile(File inputFile) {
		System.out.println("readfile called");
		int importErrors = 0;
		try {
			BufferedReader TSVReader = new BufferedReader(new FileReader(inputFile));
			
			String line = null;
			String[] row;
			
			while((line = TSVReader.readLine()) != null) {
				row = line.split("\t");
				
				//insert a new item to the menu (TSV file row is built like this: food category-food name-food description-path to picture-food price
				if(!addItem(new MenuItem(row[1], row[2], row[3],  Double.parseDouble(row[4]), 0), row[0])) importErrors++;
			}
			
			TSVReader.close();
			
			System.out.println("There were " + importErrors + " menu items that could not be imported from file.");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
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





