//using dynamic programming method
import java.util.Scanner;
public class fibonacci2 {
    public static int fib(int n){


        int arr [] = new int[n+1];
        arr[0] = 0;
        if(n>0){
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        }

        return arr[n];





    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("the number "+n+" of fibonacci series : "+fib(n));
        sc.close();

    }
    
}
