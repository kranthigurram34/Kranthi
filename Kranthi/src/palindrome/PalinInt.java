package palindrome;

import java.util.Scanner;

public class PalinInt {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int number=n;
		int reverse=0;
		int result;
		while(number>0){
			result=number%10;
			reverse=reverse*10+result;
			number=number/10;
			
		}
		if(reverse==n){
			System.out.println("Given number is a Palindrome!"  +n);
		}
		else{System.out.println("Given number is not a Palindrome!"  +n);}
		}
	}


