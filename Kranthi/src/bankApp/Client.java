package bankApp;
public class Client{
	public static void main(String[] args)
	{
	savingsAccount s=new savingsAccount();
	s.accountCreation();
	s.customerDetails();
	s.deposit();
	s.balanceEnquiry();
	s.withdraw();
	s.balanceEnquiry();
	
	currentAccount c=new currentAccount();
	c.accountCreation();
	c.customerDetails();
	c.deposit();
	c.balanceEnquiry();
	c.withdraw();
	c.balanceEnquiry();
	
	dematAccount d=new dematAccount();
	d.accountCreation();
	d.customerDetails();
	d.purchasingShares();
	d.sellingShares();
	
}
}