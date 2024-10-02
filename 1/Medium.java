//02-10-2024
package Medium;

import java.util.Scanner;

public class Medium {
	  //Q1
       public static void  q1() {
    	   int start;
    	   int end;
    	   System.out.println("enter the range:");
    	   Scanner sc=new Scanner(System.in);
    	   start=sc.nextInt();
    	   end=sc.nextInt();
    	   System.out.println("The prime numbers in the given range are:");
    	   for(int i=start;i<=end;i++) {
    		   if(prime(i)) {
    			   System.out.println(i);
    		   }
    	   }
    	   
       }
       private static boolean prime(int n) {
    	   if (n <= 1) {
           	return false;
           }
           if (n <= 3) {
           	return true; 
           }
           if (n % 2 == 0 || n % 3 == 0) {
           	return false; 
           }
           
           
           int limit = (int) Math.sqrt(n);
           for (int i = 5; i <= limit; i += 6) {
               if (n % i == 0 || n % (i + 2) == 0) {
               	return false;
               }
           }
           return true;
       }
       //Q2
       public static void q2() {
    	   int start;
    	   int end;
    	   System.out.println("Enter the range:");
    	   Scanner sc=new Scanner(System.in);
    	   start=sc.nextInt();
    	   end=sc.nextInt();
    	   System.out.println("Armstrong numbers in the given range:");
    	   for(int i=start;i<=end;i++) {
    		   if(Armstrong(i)) {
    			   System.out.println(i);
    		   }
    	   }
       }
       private static boolean Armstrong(int num) {
    	   int originalNumber=num;
       	int numberOfDigits=0;
       	int temp=num;
       	int sum=0;
       	while(temp!=0) {
       		temp=temp/10;
       		numberOfDigits++;
       	}
       	temp=num;
       	
       	while(temp!=0) {
       		int digit=temp%10;
       		sum+=Math.pow(digit,numberOfDigits);
       		temp=temp/10;
       	}
       	return sum==originalNumber;
       }
       //Q3
       public static void q3() {
    	   int number;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter the number which has to be represented as sum of primes:");
    	   number=sc.nextInt();
    	   boolean found=false;
    	   for(int i=2;i<=number/2;i++) {
    		   if(prime(i)&&prime(number-i)) {
    			   found=true;
    			   System.out.println(number+" can be expressed as sum of "+i+" and "+(number-i));
    		   }
    		   
    	   }
    	   if(!found) {
    			   System.out.println(number+" cannot be expressed as sum of two primes");
    	   }
       }
       //Q4
       public static void q4() {
    	   int num;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the interger:");
    	   num=sc.nextInt();
    	   int replaced_int=Integer.parseInt(String.valueOf(num).replace("0","1"));
    	   System.out.println("Replaced integer="+replaced_int);
    	   
       }
    // Q5
       public static void q5() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a binary number: ");
           String binary = sc.next();
           
           int decimal = Integer.parseInt(binary, 2);
           System.out.println("Decimal equivalent: " + decimal);
       }

       // Q6
       public static void q6() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a decimal number: ");
           int decimal = sc.nextInt();
           
           String binary = Integer.toBinaryString(decimal);
           System.out.println("Binary equivalent: " + binary);
       }

       // Q7
       public static void q7() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a decimal number: ");
           int decimal = sc.nextInt();
           
           String octal = Integer.toOctalString(decimal);
           System.out.println("Octal equivalent: " + octal);
       }

       // Q8
       public static void q8() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter an octal number: ");
           String octal = sc.next();
           
           int decimal = Integer.parseInt(octal, 8);
           System.out.println("Decimal equivalent: " + decimal);
       }

       // Q9
       public static void q9() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter a binary number: ");
           String binary = sc.next();
           
           int decimal = Integer.parseInt(binary, 2);
           String octal = Integer.toOctalString(decimal);
           System.out.println("Octal equivalent: " + octal);
       }

       // Q10
       public static void q10() {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter an octal number: ");
           String octal = sc.next();
           
           int decimal = Integer.parseInt(octal, 8);
           String binary = Integer.toBinaryString(decimal);
           System.out.println("Binary equivalent: " + binary);
       }
       //Q11
       public static void q11() {
    	   int n;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the number of people:");
    	   n=sc.nextInt();
    	   int result=n*(n-1)/2;
    	   System.out.println("Minimum number of handshakes are:"+result);
       }
       //Q12
       public static void q12() {
    	   double x;
    	   double y;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the x and y co-ordinates:");
    	   x=sc.nextDouble();
    	   y=sc.nextDouble();
    	   if(x>0 && y>0) {
    		   System.out.println("The co-ordinates"+"("+x+","+y+")lies in the quandrant 1");
    	   }
    	   else if(x<0 && y>0) {
    		   System.out.println("The co-ordinates"+"("+x+","+y+")lies in the quandrant 2");
    	   }
    	   else if(x<0 && y<0) {
    		   System.out.println("The co-ordinates"+"("+x+","+y+")lies in the quandrant 3");
    	   }
    	   else if(x>0 && y<0) {
    		   System.out.println("The co-ordinates"+"("+x+","+y+")lies in the quandrant 4");
    	   }
    	   else
    		   System.out.println("The co-ordinates"+"("+x+","+y+")lies on the axis");
       }
       //Q13()
       public static void q13() {
           String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
           String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
           String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
           int num;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the number:");
           num=sc.nextInt();
           if (num < 10) {
               System.out.println(units[num]);
           } else if (num < 20) {
               System.out.println(teens[num - 10]);
           } else {
               int ten = num / 10;
               int unit = num % 10;
               System.out.println(tens[ten] + (unit > 0 ? " " + units[unit] : ""));
           }
       }
       //Q14()
       public static void q14() {
    	    int daysInMonth;
    	    
    	    int month;
    	    int year;
    	    Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter the month number and year:");
    	    month=sc.nextInt();
    	    year=sc.nextInt();
    	    if (month < 1 || month > 12) {
    	        System.out.println("Invalid month: " + month);
    	        return;
    	    }

    	    switch (month) {
    	        case 1: 
    	        case 3: 
    	        case 5: 
    	        case 7: 
    	        case 8: 
    	        case 10: 
    	        case 12:
    	            daysInMonth = 31;
    	            break;
    	        case 4: 
    	        case 6: 
    	        case 9: 
    	        case 11: 
    	            daysInMonth = 30;
    	            break;
    	        case 2: 
    	            daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
    	            break;
    	        default:
    	            daysInMonth = 0; 
    	    }

    	    System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);
    	}
       //Q15()
       public static void q15() {
    	   int n;
    	   int r;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the number of people and number of seats:");
    	   n=sc.nextInt();
    	   r=sc.nextInt();
           int permutations = factorial(n) / factorial(n - r);
           System.out.println("Number of permutations of " + n + " people in " + r + " seats is: " + permutations);
       }
       private static int factorial(int num) {
           if (num == 0 || num == 1) return 1;
           return num * factorial(num - 1);
       }
       //Q16()
       public static void q16() {
    	   int n;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the no.of numbers:");
    	   n=sc.nextInt();
           int count = 0;
           for (int i = 0; i <= n; i++) {
               count += countDigitOccurrences(i, 3);
           }
           System.out.println("Digit 3 occurs " + count + " times from 0 to " + n);
       }

       private static int countDigitOccurrences(int num, int digit) {
           int count = 0;
           while (num != 0) {
               if (num % 10 == digit) count++;
               num /= 10;
           }
         return count;
       }
       //Q17()
       public static void q17() {
    	   int n;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the no.of numbers:");
    	   n=sc.nextInt();
           int count = 0;
           for (int i = 1; i <= n; i++) {
               if (countDivisors(i) == 9) count++;
           }
           System.out.println("Number of integers with exactly 9 divisors up to " + n + " is: " + count);
       }

       private static int countDivisors(int num) {
           int count = 0;
           for (int i = 1; i <= Math.sqrt(num); i++) {
               if (num % i == 0) {
                   count += (i * i == num) ? 1 : 2;
               }
           }
           return count;
       }
       //Q18()
       public static void q18(double a, double b, double c) {
           double discriminant = b * b - 4 * a * c;
           if (discriminant > 0) {
        	   double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
               double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
               System.out.println("Roots are real and different: " + root1 + ", " + root2);
           } else if (discriminant == 0) {
               double root = -b / (2 * a);
               System.out.println("Roots are real and the same: " + root);
           } else {
               double realPart = -b / (2 * a);
               double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
               System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i, " + realPart + " - " + imaginaryPart + "i");
           }
       }
           

       

   	
       
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   q1();
    	   q2();
    	   q3();
    	   q4();
    	   q5();
    	   q6();
    	   q7();
    	   q8();
    	   q9();
    	   q10();
    	   q11();
    	   q12();
    	   q13();
    	   q14();
    	   q15();
    	   q16();
    	   q17();
    	   q18(23,42,56);
    	   
    	   sc.close();
    	   
       }
       
}
