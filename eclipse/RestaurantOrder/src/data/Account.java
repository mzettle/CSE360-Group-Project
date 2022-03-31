package data;

//Abstract classes can implement methods; they are not as strict as interfaces
public abstract class Account {
	// changed username status from public->private; use getters
	// More reliability and control
	private String username;
	private String password;
	
	public abstract boolean verifyPass(String input);
	
	// created protected getters/setters for Account Information
	protected String getUsername() {
		return this.username;
	}
	
	protected String getPassword() {
		return this.password;
	}
	
	protected void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	protected void setPassword(String newPassword) {
		this.password = newPassword;
	}
}
