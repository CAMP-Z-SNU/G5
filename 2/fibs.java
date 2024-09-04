package fibonacci;
import java.util.*;
public class fibs {
	public static int fibsum(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return(fibsum(n-1)+fibsum(n-2));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Try again");
		}
		else {
			for(int i=0;i<n;i++) {
				System.out.println(fibsum(i));
			}
		}
	}

}
