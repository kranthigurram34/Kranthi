package inheritance.single;
class B extends Single{
	void check()
	{
		System.out.println("Bike is running safely");
	}
public static void main(String[] args)
{
B obj=new B();
obj.run();
obj.check();
}
}