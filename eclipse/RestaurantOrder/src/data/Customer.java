package data;

public class Customer extends Account{
	// Change ContactInfo and PayInfo to their respective classes
	// after you have written the code for the classes. 
	public ContactInfo contactInfo;
	public PaymentInfo paymentInfo;
	
	public Customer(String username, String password) {
		contactInfo = new ContactInfo();
		paymentInfo = new PaymentInfo();
		
		this.setUsername(username);
		this.setPassword(password);
	}


	public void setContactInfo(String fName, String lName, String phoneNum, String email){
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
