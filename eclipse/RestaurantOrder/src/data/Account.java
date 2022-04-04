package data;

//Abstract classes can implement methods; they are not as strict as interfaces
public abstract class Account {
	// changed username status from public->private; use getters
	// More reliability and control
	private String username;
	private String password;
	
	public boolean verifyPass(String input) {
		// String.equals(String) condition that they are not passing
		// a NULL value. 
		if(input != null) {
			if(this.getPassword().equals(input)) {
				return true;
			}
		}
		return false;
	}
	
	// created protected getters/setters for Account Information
	public String getUsername() {
		return this.username;
	}
	
	protected String getPassword() {
		return this.password;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
}
