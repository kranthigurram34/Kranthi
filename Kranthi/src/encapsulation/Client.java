package encapsulation;
public class Client{
	public static void main(String[] args)
	{
	Encapsulation e=new Encapsulation();
	e.setId(1);
	e.setName("Anudeep");
	e.setSalary(25000);
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSalary());
}
}