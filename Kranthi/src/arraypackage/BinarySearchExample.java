package arraypackage;

import java.util.Scanner;

class BinarySearchExample{  
	 public static void main(String args[]){ 
   
    	 int arr[] = {10,20,30,40,50};  
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Element to be found :"); 
         int key=sc.nextInt();
         int first=0;
         int last=arr.length-1;  
       
       

        while (last>=first){  
            int mid = (first+last)/2;  
            if (arr[mid] < key){  
            first=mid+1;  
            }  
            else if (arr[mid] > key){  
           last=mid-1;  
            }else{  
           System.out.println("key found  :" +arr[mid]);  
           break;
            }  
        }  
      if(first>last) { System.out.println("key not found  :"   +key); }
    }  
    
              
    }  
