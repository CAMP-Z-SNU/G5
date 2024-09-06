package primeno;
import java.util.*;
//using brute force 
public class brute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int num=sc.nextInt();
		int x=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				x=1;
				break;
			}
		}
		if(x==0) {
			System.out.println("It is a prime number.");
			}
		else {
			System.out.println("It is not a prime number.");
		}
	}

}
