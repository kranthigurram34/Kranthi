package inheritance.multilevel;
public class C extends B{
	void stop()
	{
		System.out.println("bike stopped running");
	}

public static void main(String[] args)
{
C obj=new C();
obj.stop();
obj.check();
obj.run();
}
}