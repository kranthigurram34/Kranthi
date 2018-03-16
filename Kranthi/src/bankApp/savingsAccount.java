package bankApp;
public class savingsAccount implements creatingAccount{
	int amount=0;
	Customer e=new Customer();
	public void accountCreation() {

		e.setAccountNumber(1);
		e.setFirstName("Anudeep");
		e.setLastName("Challa");
		e.setGender("Male");
		e.setAge(23);
		e.setAddress("Hyderabad");
		e.setContactNumber(1234567809);
		System.out.println("Your Savings Account is Created!");
	}
	public void customerDetails() {
			System.out.println("Your Savings Account Details: ");
			System.out.println("Account Number: "+e.getAccountNumber());
			System.out.println("First Name: "+e.getFirstName());
			System.out.println("Last Name: "+e.getLastName());
			System.out.println("Gender: "+e.getGender());
			System.out.println("Age: "+e.getAge());
			System.out.println("Address: "+e.getAddress());
			System.out.println("Mobile Number: "+e.getContactNumber());
			
	}
	public void deposit() {
		e.setDeposit(15000);
		System.out.println("You have deposited the amount: "+e.getDeposit());
		amount=amount+ (e.getDeposit());
		
	}
	public void withdraw() {
		e.setWithdraw(1000);
			System.out.println("You have withdrawn the amount: "+e.getWithdraw());
			amount=amount-(e.getWithdraw());
	}
	public void balanceEnquiry() {
		System.out.println("Your Account Balance is: "+amount);
	} 
	
}

