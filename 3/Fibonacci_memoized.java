//Date : 09/09/24(supposed to submit on 06/09/24)
//The was a serious flaw in recusion code of finding fibonacci number . 
//The time complexity was O(2^n) because there were 2 recursive calls for each value of n . this memoization approach reduces the time complexity to O(n) since the once calculated 'n' is stored in an array and will be accessed whenever needed for other number's calculation instead of calling it again.   
import java.util.Scanner;
public class Fibonacci_memoized {

    public static int[] arr;

    public static int fib(int n){
        if(n<=1) 
        return n;
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n] = fib(n-1) + fib(n-2);
        return arr[n];
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        arr = new int[n+1];

        for(int i=0;i<=n;i++){
            arr[i]=-1;
        }

        System.out.println("The fibonacci number is : "+fib(n));
        sc.close();



    }
    
}

//Difficulty level : 80% 
//reason : I understood the memoization recursion and normal recursion seperately . it took some time for me to understand in what way is memoization recursion better than recursion . asked chatgpt to visually show the recursive call for both to analyse the difference and at this point I understood .

