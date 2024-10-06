#include<stdio.h>
//Check Whether a Character is Vowel or Consonant
void func1(char x){
    if(x=='a'|| x=='A' || x=='e'|| x=='E' || x=='i'|| x=='I' || x=='o' || x=='O' || x=='u' || x=='U'){
        printf("It is a vowel");
    }
    else{
        printf("It is a consonant");
    }
}

//A character is an alphabet or not
void func2(char x){
    if(x>='A' && x<='Z' && x>='a' && x<='z' ){
        printf("It is an alphabet");
    }
    else{
        printf("It is not an alphabet");
    }
}

//Ascii values of a character
void func3(char x){
    int a=x;
    printf("The ASCII value is:");
    printf("%d",a);
    }

//Uppercase, Lowercase or special character
void func4(char x){
    if(x>='A' && x<='Z'){
        printf("It is uppercase");
    }
    else if(x>='a' && x<='z'){
        printf("It is lowercase");
    }
    else{
        printf("It is a special character");
    }    
}

//A number is positive or negative
void func5(int x){
    if(x>0){
        printf("It is positive");
    }
    else{
        printf("It is negative");
    }   
}

//A number is even or odd
void func6(int x){
    if(x%2==0){
        printf("It is even");
    }
    else{
        printf("It is odd");
    }   
}

//Swap two numbers without third variable
void func7(int a, int b){
    printf("Value of a: %d",a);
    printf("Value of b: %d",b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("Value of a: %d",a);
    printf("Value of b: %d",b);
}

//Area of a circle
void func8(float r){
    double area=3.14*r*r;
    printf("%lf",area);
}

//LCM of two numbers
void func9(int a,int b){
    int x=a*b;
    for(int i=2;i<=x;i++){
        if(i%a==0 && i%b==0){
            printf("The LCM is %d",i);
            break;
        }
    }
}

//GCD of two numbers
void func10(int a,int b){
    int x;
    if(a>b){
        x=b;
    }
    else{
        x=a;
    }
    int flag;
    for(int i=1;i<=x;i++){
        if(a%i==0 && b%i==0){
            flag=i;
        }
    }
    printf("The GCD is:%d",flag);
}

//Greatest of two numbers
void func11(int a,int b){
    if(a>b){
        printf("Greatest number is:%d",a);
    }
    else{
        printf("Greatest number is:%d",b);
    }
}

//Greatest of three numbers
void func12(int a,int b,int c){
    if(a>b && a>c){
        printf("Greatest number is:%d",a);
    }
    else if(b>a && b>c){
        if(a>c){
        printf("Greatest number is:%d",b);
    }
    }
    else{
        printf("Greatest number is:%d",c);
    }
}

//Number of digits in an integer
void func13(int a){
    int x=a;
    int count=0;
    while(x!=0){
        count+=1;
        x=x/10;
    }
    printf("Number of digit:%d",count);
}

//Sum of digits of a number
void func14(int a){
    int x=a;
    int count=0;
    while(x!=0){
        count+=x%10;
        x=x/10;
    }
    printf("Sum of digits:%d",count);
}

//Sum of N natural numbers
void func15(int N){
    int sum=0;
    for(int i=1;i<=N;i++){
        sum+=i;
    }
    printf("Sum of N numbers:%d",sum);
}

//Sum of numbers in a given range
void func16(int a,int b){
    int sum=0;
    for(int i=a;i<=b;i++){
        sum+=i;
    }
    printf("Sum of numbers in range %d and %d:%d",a,b,sum);
}

//Reverse a given number
void func17(int num){
    int n=num;
    int rev=0;
    while(n!=0){
        rev=(rev*10)+(n%10);
        n=n/10;
    }
    printf("Reversed number:%d",rev);
}

//Factorial of a number
void func18(int num){
    int fact=1;
    for(int i=2;i<=num;i++){
        fact=fact*i;
    }
    printf("Factorial is:%d",fact);
}

//Fibonacci series up to n
void func19(int n){
    int a=0;
    int b=1;
    int c=1;
    printf("The fibonacci series is:\n");
    for(int i=0;i<n;i++){
        c=a+b;
        printf("%d\n",c);
        a=b;
        b=c;
    }
}

//Leap year or not
void func20(int year){
    if(year%100==0){
        if(year%400==0){
            printf("It is a leap year");
        }
    }
    else if(year%4==0){
        printf("It is a leap year");
    }
    else{
        printf("It is not a leap year");
    }
}

//Prime number or not
void func21(int n){
    int flag=0;
    for(int i=2;i<(n/2)+1;i++){
        if(n%i==0){
            flag=1;
            break;
        }
    }
    if(flag==1){
        printf("It is not a prime number");
    }
    else{
        printf("It is a prime number");
    }
}

//Palindrome or not
void func22(int num){
    int n=num;
    int rev=0;
    while(n!=0){
        rev=(rev*10)+(n%10);
        n=n/10;
    }
    if(rev==num){
        printf("It is a palindrome");
    }
    else{
        printf("It is not a palindrome");
    }

#include<math.h>
//Armstrong number or not
void func22(int num){
    int x=num;
    int y=num;
    int count=0;
    while(x!=0){
        count+=1;
        x=x/10;
    }
    int c=0;
    while(y!=0){
        int u=y%10;
        c+=pow(u,count);
        y=y/10;
    }
    printf("%d",c);
    if(c==num){
        printf("It is an armstrong number");
        }
    else{
       printf("It is not an armstrong number"); 
    }
    
}

//Strong number or not
int fact(int num){
    int fact=1;
    for(int i=2;i<=num;i++){
        fact=fact*i;
    }
    return fact;
}
void func23(int x){
    int summ=0;
    int u=x;
    while(u!=0){
        int z=u%10;
        summ+=fact(z);
        u=u/10;
            }
    if(summ==x){
        printf("It is a strong number");
        }
    else{
        printf("It is not a strong number");
    }
}

//Perfect number or not
void func24(int num){
    int summ=0;
    int u=num;
    for(int i=1;i<num;i++){
        if(num%i==0){
            summ+=i;
        }
    }
    //printf("%d",summ);
    if(summ==num){
        printf("It is a perfect number");
        }
    else{
      printf("It is not a perfect number");  
    }
}

//Friendly pair or not (amicable or not)
void func25(int a,int b){
    int sum1=0;
    int sum2=0;
    for(int i=1;i<a;i++){
        if(a%i==0){
            sum1+=i;
        }
    }
    for(int i=1;i<b;i++){
        if(b%i==0){
            sum2+=i;
        }
    }
    float r1=sum1/a;
    float r2=sum2/b;
    //printf("%f %f",r1,r2);
    if(r1==r2){
        printf("It is a friendly pair");
        }
    else{
      printf("It is not a friendly pair");  
    }
}

//Automorphic number or not
int numcount(int a){
    int x=a;
    int count=0;
    while(x!=0){
        count+=1;
        x=x/10;
    }
    return count;
}


void func26(int num){
    int sq=num*num;
    int c=numcount(num);
    int n=0;
    for(int i=0;i<c;i++){
        int v=sq%10;
        n=(n*10)+v;
        sq=sq/10;
        
    }
    int y=n;
    int rev=0;
    while(y!=0){
        rev=(rev*10)+(y%10);
        y=y/10;
    }
    //printf("\n%d",rev);
    if(rev==num){
        printf("It is automorphic number");
    }
    else{
       printf("It is not automorphic number"); 
    }
}

//Harshad number or not
int summ(int a){
    int x=a;
    int count=0;
    while(x!=0){
        count+=x%10;
        x=x/10;
    }
    return count;
}
void func27(int num){
    if(num%summ(num)==0){
        printf("It is Harshad number");
    }
    else{
        printf("It is not Harshad number");
    }
}

//Abundant number or not
void func28(int num){
    int summ=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            summ+=i;
        }
    }
    if(summ>num){
        printf("It is abundant number");
    }
    else{
        printf("It is not abundant number");
    }
}

//Power of a number
void func29(int base,int exp){
    int x=1;
    while(exp!=0){
        x*=base;
        exp--;
    }
    printf("%d",x);
}

//Factors of a number
void func30(int num){
    printf("The factors are:");
    for(int i=1;i<=num;i++){
        if(num%i==0){
            printf("%d\n",i);
        }
    }
}

//Add two fractions
void func31(int a,int b,int c,int d){
    int x=(a*d)+(b*c);
    int y=b*d;
    int gcd;
    for(int i=1; i <= x && i <= y; ++i)
    {
        if(x%i==0 && y%i==0)
            gcd = i;
    }
    printf("%d/%d",x/gcd,y/gcd);
}
