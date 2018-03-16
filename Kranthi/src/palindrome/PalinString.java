package palindrome;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word :");
		String s=sc.nextLine();
		String reverse="";
		for(int i = s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)){
			System.out.println("It is palindrome");
		}
		else{System.out.println("It is not a palindrome");}

	}

	
	}


