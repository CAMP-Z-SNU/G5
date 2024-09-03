import java.util.Scanner;
public class armstrong {

    public static boolean isarmstrong(int num){


        String number = Integer.toString(num);
        int length = number.length(); 
        int sum =0;
        for(char ch : number.toCharArray()){

            int digit = Character.getNumericValue(ch);
            sum += Math.pow(digit, length) ;

        }
        return sum==num;
        
    }





    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            
            // Call the non-static method on the instance
            boolean result = isarmstrong(number);
            if(result==true){
                System.out.println(number + " is an armstrong number");
            }else{
                System.out.println(number + " is not an armstrong number");
            }
            
            
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        // Close the scanner
        sc.close();
    }
}

    

    

    

