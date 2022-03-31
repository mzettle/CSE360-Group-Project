package data;
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
		}else {
			System.out.println("Account Database is empty; returning \'null\' value.");
		}
		return null;
	}
}
