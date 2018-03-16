package arraypackage;

import java.util.Scanner;

public class SwapArrayNumbers {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size :");
		y=sc.nextInt();
		int a[]=new int[y];
		int b[]=new int[y];
		System.out.println("Enter the Elements of First Array :");
		for(x=0;x<a.length;x++)
			a[x]=sc.nextInt();
		System.out.println("Enter the Elements of Second Array :");
		for(x=0;x<b.length;x++)
			b[x]=sc.nextInt();
		System.out.println("The Elements in First Array are :");
		for(x=0;x<a.length;x++)
			System.out.println(a[x]);
		System.out.println("The Elements in Second Array are :");
		for(x=0;x<b.length;x++)
			System.out.println(b[x]);
		System.out.println("The Elements after Swaping :");
		for(x=0;x<y;x++){
			a[x]=a[x]+b[x];
			b[x]=a[x]-b[x];
			a[x]=a[x]-b[x];
			
		}
		
		System.out.println("The Elements in First Array after Swapping :");
		for(x=0;x<a.length;x++)
			System.out.println(a[x]);
		System.out.println("The Elements in Second Array a :");
		for(x=0;x<b.length;x++)
			System.out.println(b[x]);
			
		{
			
		}

	}

}
