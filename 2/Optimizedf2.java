//Optimized code to check if a number(num) is a prime number or not.
package primeno;
import java.util.*;
public class Optimizedf2 {
	public static boolean f2(int num) {
		boolean x=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				x=true;
				break;
	}
			
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int num=sc.nextInt();
		if(f2(num)==true) {
			System.out.println("It is not prime");
		}
		else {
			System.out.println("It is prime");
		}
			
		


	}

}
