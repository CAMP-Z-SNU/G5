#include <stdio.h> 

int coun1(int N) 
{
    int c = 0;  
    while (N!=0) 
    {   
        N=N&(N-1);
        c++;      
    }
    return c; 
}

int main() 
{
    int number ;
    printf("Enter number:");
    scanf("%d",&number);
    printf("The number of 1s in the binary form of %d is %d\n", number, count1(number));
    return 0; 
}
