//Brute force code to check if a number(num) is a prime number or not.
package primeno;
import java.util.*;
public class Bruttef1 {
	public static boolean f1(int num) {
		boolean x=false;
		for(int i=2;i*i<=num;i++)
		{
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
		if(f1(num)==true) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
	}

}
