//Date : 06/09/2024
//write a program to check if the number is prime, one in brute force, other in optimised way, 
//bool f1(int), bool f2(int)


//Optimized approach
import java.util.Scanner;

public class PrimeOptimized {

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
         else{
            System.out.println(n+" is not a prime number");
         }
         sc.close();
     }
    } 
    

//difficulty level : 30%