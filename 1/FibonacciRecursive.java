package Fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
	   int n;
	   System.out.println("Enter the value of n to find nth fibonacci number:");
	   n=sc.nextInt();
	   int result=fibonacci(n);
	   System.out.println(n+"th fibonacci number is:"+result);
	   }
	   public static int fibonacci(int n) {
	       if(n<=1) {
	           return n;
	       }
	       return fibonacci(n-1)+fibonacci(n-2);
	   }
}
