package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class AccountDatabase {
	private ArrayList<Account> users;
	
	public Account lookUpUsername(String input) {
		// Check that users is not an empty ArrayList
		if(this.users.size() > 0) {
			for(Account index : this.users) {
				if(index.getUsername().equals(input)) {
					return index;
				}
			}
		}
		
		System.out.println("Account Database is empty; returning \'null\' value.");
		return null;
	}
	
	public boolean addUser(String username, String password) {
		
		//if the username is taken, return false (failed to add user)
		for(Account index : users) {
			if(index.getUsername().equals(username)) return false;
		}
		
		//if the username is not taken, add the user to the database
		users.add(new Customer(username, password));
		return true;
	}
	
	public boolean readFile(File inputFile) {
		System.out.println("Reading Accounts from file");
		int importErrors = 0;
		try {
			BufferedReader TSVReader = new BufferedReader(new FileReader(inputFile));
			
			String line = null;
			String[] row;
			
			while((line = TSVReader.readLine()) != null) {
				row = line.split("\t");
				
				//insert a new item to the menu (TSV file row is built like this: food category-food name-food description-path to picture-food price
				switch(row[0]){
				case "user" :
					users.add(new Customer(row[1], row[2]));
					//need to add customers' information too
					break;
				case "admin" : 
					System.out.println("admin account not implemented");
				}
			}
			
			TSVReader.close();
			
			System.out.println("");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
