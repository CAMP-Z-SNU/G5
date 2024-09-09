//Date : 09/09/2024(suppossed to submit on 06/09/24)
//Find if a number is prime or not, brutforce approach
import java.util.Scanner;
public class Prime_brutforce {

    public static boolean primecheck(int n){

        if(n<=1)
        return false;

        int k = (int) Math.sqrt(n);
        for(int i=2;i<k;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;

    }
    

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        boolean result = primecheck(n);
        if(result==true){
            System.out.println("It is a prime number .");
        }
        else{
            System.out.println("It is not a prime number .");
        }

        sc.close();
    }
}

//Difficulty level : 20% (The 20% includes syntax only , the concept was easy so 0% difficulty level for logic) 