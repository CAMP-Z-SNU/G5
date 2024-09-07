//DATE : 07/09/2024
//optimized prime number code hint: 6n+-1

import java.util.Scanner;
public class PrimeNum {

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

    
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        
            
            if (n < 0) {
                System.out.println("Enter non-negative number : ");
            } else if(n>=0) {
            
                if (isPrime(n)) {
                    System.out.println(n + " is a prime number.");
                } else {
                    System.out.println(n + " is not a prime number.");
                }
            }
        
         else{
            System.out.println("Please enter a valid integer.");
        }

        sc.close();
    }
}

//Difficulty level : didnt get idea on my own , browsed it in google but couldnt understand the logic behind incrementing by 6 . Used chatgpt and later understood . 
// hence difficulty level : 100%(initially) , 50%(after using chatgpt)
    

