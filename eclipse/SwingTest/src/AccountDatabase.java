import java.util.ArrayList;

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