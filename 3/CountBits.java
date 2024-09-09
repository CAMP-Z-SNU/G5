//Date : 09/09/24
//To count number of 1's in binary number of an integer 
import java.util.Scanner;
public class CountBits {

    public static int BitCount(int n){

    
        int count =0;
        while(n>0){

            if((n&1)==1){
                count = count+1;
            }

            n>>=1;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int n = sc.nextInt();

        int result = BitCount(n);
        System.out.println("The number of one's in binary representation of entered integer is : "+result);




        sc.close();
    }
    
}

//Difficulty level : 60%
