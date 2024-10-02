//29-09-2024
package Easy;

import java.util.Scanner;

public class Easy {
	

    // Q1
    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
    
    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    // Q2
    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

    // Q3
    public static void q3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        int ascii = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + ascii);
    }

    // Q4
    public static void q4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }

    // Q5
    public static void q5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Q6
    public static void q6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // Q7
    public static void q7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Q8
    public static void q8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    // Q9
    public static void q9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Q10
    public static void q10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Q11
    public static void q11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int greatest = Math.max(a, b);
        System.out.println("Greatest of " + a + " and " + b + " is: " + greatest);
    }

    // Q12
    public static void q12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int greatest = Math.max(a, Math.max(b, c));
        System.out.println("Greatest of " + a + ", " + b + ", and " + c + " is: " + greatest);
    }

    // Q13
    public static void q13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int digits = String.valueOf(Math.abs(num)).length();
        System.out.println("Number of digits: " + digits);
    }

    // Q14
    public static void q14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Q15
    public static void q15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    // Q16
    public static void q16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start and end of the range: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers in the range [" + start + ", " + end + "]: " + sum);
    }

    // Q17
    public static void q17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Q18
    public static void q18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    // Q19
    public static void q19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Q20
    public static void q20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Q21
    public static void q21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    // Q22
    public static void q22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int original = num, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original + (original == reversed ? " is a palindrome." : " is not a palindrome."));
    }

    // Q23
    public static void q23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0, original = num, digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        System.out.println(original + (original == sum ? " is an Armstrong number." : " is not an Armstrong number."));
    }

    // Q24
    public static void q24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        System.out.println(original + (original == sum ? " is a Strong number." : " is not a Strong number."));
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Q25
    public static void q25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(num + (sum == num ? " is a perfect number." : " is not a perfect number."));
    }

    // Q26
    public static void q26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);
        if (sumA == b && sumB == a) {
            System.out.println(a + " and " + b + " are friendly (amicable) pairs.");
        } else {
            System.out.println(a + " and " + b + " are not friendly (amicable) pairs.");
        }
    }

    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Q27
    public static void q27() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int square = num * num;
        String strNum = String.valueOf(num);
        String strSquare = String.valueOf(square);
        
        if (strSquare.endsWith(strNum)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }

    // Q28
    public static void q28() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0, original = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(original + (original % sum == 0 ? " is a Harshad number." : " is not a Harshad number."));
    }

    // Q29
    public static void q29() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(num + (sum > num ? " is an Abundant number." : " is not an Abundant number."));
    }

    // Q30
    public static void q30() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base and exponent: ");
        double base = scanner.nextDouble();
        int exponent = scanner.nextInt();
        
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + power);
    }

    // Q31
    public static void q31() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
public static void main(String[] args) {
        
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
        q18(); 
        q19(); 
        q20(); 
        q21(); 
        q22(); 
        q23(); 
        q24(); 
        q25(); 
        q26(); 
        q27(); 
        q28(); 
        q29(); 
        q30(); 
        q31(); 
         
    }

    
}
