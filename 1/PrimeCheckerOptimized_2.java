//optimized prime number code hint: 6n+-1
//07-09-2024
package PrimeChecker;

import java.util.Scanner;

public class PrimeCheckerOptimized_2 {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
        	return false;
        }
        if (n <= 3) {
        	return true; 
        }
        if (n % 2 == 0 || n % 3 == 0) {
        	return false; 
        }
        
        //Using 6n+-1 approach..Because every prime number can be written in 6n+-1 form
        int limit = (int) Math.sqrt(n);
        for (int i = 5; i <= limit; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
            	return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
//difficulty level:60
