package data;

public class Customer extends Account{
	// Change ContactInfo and PayInfo to their respective classes
	// after you have written the code for the classes. 
	public ContactInfo contactInfo;
	public PaymentInfo paymentInfo;
	
	public Customer(String username, String password) {
		
		super(username, password);
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
		paymentInfo.firstName = fName; 
		paymentInfo.lastName = lName;
		paymentInfo.ccNumber = creditCardNumber;
		paymentInfo.expMonth = eMonth;
		paymentInfo.expYear = eYear;
		paymentInfo.ccCSV = creditCardCSV;
		paymentInfo.address = staddress;
		paymentInfo.city = city;
		paymentInfo.state = state;
		paymentInfo.country = country;
		paymentInfo.postalCode = postalCode;
	}
}
