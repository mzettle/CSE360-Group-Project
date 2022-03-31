package data;

public class Customer extends Account{
	// Change ContactInfo and PayInfo to their respective classes
	// after you have written the code for the classes. 
	private ContactInfo contactInfo;
	private PaymentInfo paymentInfo;
	
	public Customer() {
		this.setUsername("");
		this.setPassword("");
	}
	
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

	public void setContactInfo(String fName, String lName, int phoneNum, String email){
		this.contactInfo.firstName = fName;
		this.contactInfo.lastName = lName;
		this.contactInfo.phoneNumber = phoneNum;
		this.contactInfo.emailAddress = email;
	}

	public void setPaymentInfo(String fName, String lName, String creditCardNumber, int eMonth, int eYear, int creditCardCSV, String staddress, String city, String state, String country, String postalCode){
		this.paymentInfo.firstName = fName;
		this.paymentInfo.lastName = lName;
		this.paymentInfo.ccNumber = creditCardNumber;
		this.paymentInfo.expMonth = eMonth;
		this.paymentInfo.expYear = eYear;
		this.paymentInfo.ccCSV = creditCardCSV;
		this.paymentInfo.address = staddress;
		this.paymentInfo.city = city;
		this.paymentInfo.state = state;
		this.paymentInfo.country = country;
		this.paymentInfo.postalCode = postalCode;
	}
}
