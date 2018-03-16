package polymorphism.overriding;
class B extends Overriding{
	@Override
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
	@Override
	void run()
	{
		//super.run();
		System.out.println("Bike is Running Safely");
	}
}