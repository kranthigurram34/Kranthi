package bankApp;
 public class Customer{
	private int accountNumber, age, deposit, withdraw, balamt;
	private long contactNumber;
	private String firstName, lastName, address, gender;

 public void setAccountNumber(int accnum) {
	 accountNumber=accnum;
 }
 public void setAge(int Age) {
	 age=Age;
 }
 public void setContactNumber(long cnum) {
	 contactNumber=cnum;
 }
 public void setFirstName(String fname) {
	 firstName=fname;
 }
 public void setLastName(String lname) {
	 lastName=lname;
 }
 public void setAddress(String addr) {
	 address=addr;
 }
 public void setGender(String gendr) { 
	 gender=gendr;
 } 
 public void setDeposit(int Deposit) {
	deposit=Deposit;	
 }
 public void setWithdraw(int withdrw) {
	withdraw=withdrw;	
 }
 public void setBalamt(int Balamt) {
	balamt=Balamt;	
 }
 
 

 public int getAccountNumber() {
	 return accountNumber;
 }
 public int getAge() {
	 return age;
 }
 public long getContactNumber() {
	 return contactNumber;
 }
 public String getFirstName() {
	 return firstName;
 }
 public String getLastName() {
	 return lastName;
 }
 public String getAddress() {
	 return address;
 }
 public String getGender() {
	 return gender;
 }
 public int getDeposit() {
	 return deposit;
 }
 public int getWithdraw() {
	 return withdraw;
 }
 public int getBalamt() {
	 return balamt;
 }
 }