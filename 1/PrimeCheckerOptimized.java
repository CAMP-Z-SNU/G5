

package PrimeChecker;

import java.util.Scanner;

public class PrimeCheckerOptimized {
	
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
    }
}
