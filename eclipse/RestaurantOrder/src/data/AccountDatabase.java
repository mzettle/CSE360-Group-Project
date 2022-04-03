package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class AccountDatabase {
	public ArrayList<Account> users; //temp public
	
	public AccountDatabase(){
		users = new ArrayList<Account>();
	}
	
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
		try {
			BufferedReader TSVReader = new BufferedReader(new FileReader(inputFile));
			
			String line = null;
			String[] row;
			int entry = 0;
			
			while((line = TSVReader.readLine()) != null) {
				row = line.split("\t");
				
				//insert a new item to the menu (TSV file row is built like this: 1:username, 2:password, 3:contactFirst, 4:contactLast, 5:contactPhone, 6:contactEmail
				//7: billingFirst, 8:billingLast, 9:creditCardNum, 10:expirationMonth, 11:expirationYear, 12:securityCode(CSV), 13:billingAddr, 14:billingCity, 15:billingState, 16:billingCountry, 17:postalCode
				switch(row[0]){
				case "user" :
					users.add(new Customer(row[1], row[2]));
					((Customer) users.get(entry)).setContactInfo(row[3], row[4], row[5], row[6]);
					((Customer) users.get(entry)).setPaymentInfo(row[7], row[8], row[9], Integer.parseInt(row[10]), Integer.parseInt(row[11]), Integer.parseInt(row[12]), row[13], row[14], row[15], row[16], row[17]);
					break;
				case "admin" : 
					users.add(new AdminAccount(row[1], row[2]));
					break;
				default: 
					entry--; //user had invalid type, so decrement entry
					break;
				}
				entry++;
			}
			
			TSVReader.close();
			
			System.out.println("Accounts imported");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
