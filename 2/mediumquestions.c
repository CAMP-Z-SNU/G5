#include<stdio.h>
//Prime numbers in a given range
void func1(int num){
    printf("The prime numbers are:");
    for(int i=1;i<=num;i++){
        for(int j=2;i<=i;i++){
            if(i%j==0){
                break;
            }
            else{
                printf("%d\n",i);
            }
        }
    }
}

#include<math.h>
//Armstrong numbers between two intervals
int armstrong(int num){
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
   // printf("%d",c);
    if(c==num){
        return 1;
        }
    else{
       return 0;
    }
    
}
void func2(int a,int b){
    printf("The armstrong numbers are:\n");
    for(int i=a;i<=b;i++){
        if(armstrong(i)==1){
            printf("%d\n",i);
        }
    }
}

//Can a number be expressed as a sum of two prime numbers?
int prime(int n){
    int flag=0;
    for(int i=2;i<(n/2)+1;i++){
        if(n%i==0){
            flag=1;
            break;
        }
    }
    if(flag==1){
        return 0;
    }
    else{
        return 1;
    }
}

void func3(int num){
    for(int i=2;i<=num/2;i++){
        if(prime(i)==1 && prime(num-i)==1){
            printf("It can be expressed in terms of primes:\n");
            printf("%d %d\n",i,(num-i));
        }
    }
}

//Replace all 0's with 1 in a given integer
void func4(int num){
    int u=num;
    int v=0;
    int x;
    while(u!=0){
        x=u%10;
        if(x==0){
            v=(v*10)+1;
        }
        else{
            v=(v*10)+x;
        }
        //printf("%d",v);
        u=u/10;

    }
    int n=v;
    int rev=0;
    while(n!=0){
        rev=(rev*10)+(n%10);
        n=n/10;
    }
    printf("%d",rev);
}

//Binary to decimal conversion
void func5(int bin){
    int u=bin;
    int v=u/10;
    int deci=u%10;
    int c=1;
    int x;
    while(v!=0){
        x=v%10;
        c=c*2;
        deci+=(x*c);
        v=v/10;
    }
    printf("%d",deci);
}

//Maximum number of handshakes
void func11(int num){
    int x=num*(num-1)/2;
    printf("Number of handshakes: %d",x);
}

//Quadrants in which coordinates lie
void func12(int x,int y){
    if(x>0 && y>0){
        printf("1st quadrant");
    }
    else if(x<0 && y>0){
        printf("2nd quadrant");
    }
    else if(x<0 && y<0){
        printf("3rd quadrant");
    }
    else if(x>0 && y<0){
        printf("4th quadrant");
    }
    else{
        printf("It lies on one of the axes");
    }
}



