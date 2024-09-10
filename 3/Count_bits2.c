//Date : 10/9/24
//Count number of 1s in a binary number. 3rd approach
#include <stdio.h> 

int countOnes(int num) 
{
    int count = 0;  
    while (num!=0) 
    {   
        num=num&(num-1);
        count++;      
    }
    return count; 
}

int main() 
{
    int num ;
    printf("Enter the number:");
    scanf("%d",&num);
    printf("The number of 1s in the binary form of %d is %d\n", num, countOnes(num));
    return 0; 
}

//Difficulty level : 60%