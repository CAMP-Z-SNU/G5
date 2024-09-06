//Date : 06/09/2024
// There is a serious flaw in your recusion code, what is it ? how can you try to optimise your recursive function ? 

import java.util.Scanner;
public class FibonacciOptimized {
    private static int memo[];
    
    public static int Fibonacci(int n) {
        if(memo==null ||memo.length<=n) {
            memo= new int[n+1];
        }
        for(int i=0;i<memo.length;i++) {
           memo[i]=-1; 
        }
        if(n<=1) {
            return n;
        }
        memo[n]=Fibonacci(n-1)+Fibonacci(n-2);
        return memo[n];
    }
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int result=Fibonacci(n);
        System.out.println("The fibonacci number is "+result);
        sc.close();
    }
}

//dfficulty level : 80%