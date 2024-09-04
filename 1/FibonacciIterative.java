package Fibonacci;

import java.util.Scanner;

public class FibonacciIterative {    
           public static int Fibonacci(int n) {
        	   int a=0;
        	   int b=1;
        	   int c = 0;
        	   for(int i=2;i<=n;i++) {
        		   c=a+b;
        		   a=b;
        		   b=c;
        		   
        	   }
        	   return c;
           }
           public static void main(String args[]) {
        	   Scanner sc=new Scanner(System.in);
               int n;
               System.out.println("Enter the value of n to find the nth fibonacci number:");
               n=sc.nextInt();
               int result=Fibonacci(n);
               System.out.println(n+"th fibonacci number:"+result);
       }
}
