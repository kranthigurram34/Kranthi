package bankApp;
public class dematAccount implements Bank{
	Customer e2=new Customer();
	public void accountCreation() {
		e2.setAccountNumber(3);
		e2.setFirstName("Raghavendra");
		e2.setLastName("Tirunagari");
		e2.setGender("Male");
		e2.setAge(23);
		e2.setAddress("Hyderabad");
		e2.setContactNumber(1114567809);
		System.out.println("Your Demat Account Created Succesfully!");
	}
	public void customerDetails() {
		System.out.println("Your Demat Account Details: ");
		System.out.println("Account Number: "+e2.getAccountNumber());
		System.out.println("First Name: "+e2.getFirstName());
		System.out.println("Last Name: "+e2.getLastName());
		System.out.println("Gender: "+e2.getGender());
		System.out.println("Age: "+e2.getAge());
		System.out.println("Address: "+e2.getAddress());
		System.out.println("Mobile Number: "+e2.getContactNumber());
	}
	public void purchasingShares() {
		System.out.println("You have purchased shares!");
	}
	public void sellingShares() {
			System.out.println("You have sold your shares!");
	}
}
