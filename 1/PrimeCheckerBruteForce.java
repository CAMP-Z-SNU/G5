

package PrimeChecker;

import java.util.Scanner;

public class PrimeCheckerBruteForce {
     public static boolean Prime(int n) {
    	 if(n<=1) {
    		 return false;
    	 }
    	 for(int i=2;i<n;i++) {
    		 if(n%i==0) {
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
