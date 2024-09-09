//Date : 09/09/24(suppossed to submit on 06/09/24)
//the question was to check if a number is prime in an optimized way . earlier when the task was given i didnt had knowledge of this 6+-1 approach . Since im late , by this time i got the hint thats why this code and the task that was given later look similar.
import java.util.Scanner;
public class Prime_optimized{

    
    public static boolean primecheck(int n){

            if(n<=1)
                return false;
            
            if(n<=3)
                return true;
            
            if(n%2==0||n%3 == 0)
                return false;
            

            int k = (int)Math.sqrt(n);
                for(int i = 5;i<=k;i+=6){
                    if(n%i ==  0 || n%(i+2) == 0 ){
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
            System.out.println("It is a prime number.");
        }else{
            System.out.println("Its not a prime number.");

        }
        sc.close();
    }
}

//Difficulty level : 0 , as i knew this from task given on 7th.


