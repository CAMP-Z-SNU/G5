//Date : 06/09/2024
//Brutforce approach
//write a program to check if the number is prime, one in brute force, other in optimised way, 
//bool f1(int), bool f2(int)

import java.util.Scanner;
public class primecheckbrut {
    public static boolean Prime(int n) {
	    if (n <= 1) {
	    	return false; 
	    }
	    if (n == 2) {
	    	return true;  
	    }
	    if (n % 2 == 0) {
	    	return false; 
	    }

	    int limit = (int) Math.sqrt(n);
	    for (int i = 3; i <= limit; i += 2) {
	        if (n % i == 0) {
	        	return false;
	        }
	    }
	    return true;
	}
      
	public static void main(String args[]) {
   	 int n;
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter the value of n:");
   	 n=sc.nextInt();
   	 if(Prime(n)) {
   		 System.out.println(n+" is a prime number");
   	 }
   	 else {
   		 System.out.println(n+" is not a prime number");
     }
     sc.close();
    }
}

//difficulty level : 30%