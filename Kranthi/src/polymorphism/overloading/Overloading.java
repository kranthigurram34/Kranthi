package polymorphism.overloading;

public class Overloading {
void add(int x,int y)
{
	System.out.println(x+y);
}
void add(int x, int y, int z) {
	System.out.println(x+y+z);
}
void data(int x, String y) {
	System.out.println(x+","+y);	
}
void data(int x, double y) {
	System.out.println(x+","+y);	
}
}