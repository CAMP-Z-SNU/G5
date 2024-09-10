//Check how many 1's in binary of an integer.Eg. 10 is 1010 in binary.So answer 2
//09-09-2024
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
//Difficulty rate: 50

