package arraypackage;
import java.util.Arrays;
import java.util.Scanner;  
class BinarySearchExample2{  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element to Find  :");  
        int key = sc.nextInt();  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+arr[result]);  
    }  
} 