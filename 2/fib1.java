package fibonacci;
import java.util.*;
public class fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c;
		System.out.println("Enter number of terms:");
		int num=sc.nextInt();
		System.out.println("The Fibonacci series is as follows:");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num-2;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
