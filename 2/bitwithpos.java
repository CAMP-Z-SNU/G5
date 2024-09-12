import java.util.*;
public class SetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of digits you are interested in inputting:");
        n=sc.nextInt();
        int[] arr=new int[n];
        int p;
        System.out.println("Enter the bit positions where you want 1:");
        for(int i=0;i<n;i++){
            p=sc.nextInt();
            arr[i]=p;
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x |= (1 << (arr[i] - 1)); 
        }-
        System.out.println("x = " + Integer.toBinaryString(x));

    }
}
