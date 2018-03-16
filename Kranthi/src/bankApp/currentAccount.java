package bankApp;
public class currentAccount implements creatingAccount{
	int amount=0;
	int balamount;
	Customer e1=new Customer();
	public void accountCreation() {
		e1.setAccountNumber(2);
		e1.setFirstName("Kranthi");
		e1.setLastName("Gurram");
		e1.setGender("Male");
		e1.setAge(23);
		e1.setAddress("Secunderabad");
		e1.setContactNumber(1134567809);
		System.out.println("Your Current Account Created Succesfully!");
	}
	public void customerDetails() {
		System.out.println("Your Current Account Details: ");
		System.out.println("Account Number: "+e1.getAccountNumber());
		System.out.println("First Name: "+e1.getFirstName());
		System.out.println("Last Name: "+e1.getLastName());
		System.out.println("Gender: "+e1.getGender());
		System.out.println("Age: "+e1.getAge());
		System.out.println("Address: "+e1.getAddress());
		System.out.println("Mobile Number: "+e1.getContactNumber());
	}
	public void deposit() {
		e1.setDeposit(150000);
		System.out.println("You have deposited the amount: "+e1.getDeposit());
		amount=amount+ (e1.getDeposit());
	}
	public void withdraw() {
		e1.setWithdraw(5000);
		System.out.println("You have withdrawn the amount: "+e1.getWithdraw());
		amount=amount-(e1.getWithdraw());
	}
	public void balanceEnquiry() {
		System.out.println("Your Account Balance is: "+amount);
	}

}

