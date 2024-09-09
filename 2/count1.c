#include <stdio.h>
void counts(int N)
{
    int count=0; 
    while (N > 0) { 
        if (N & 1) {
            count++;
        }
        N = N >> 1;
    }
     printf("Count of 1s in N is %d\n", count);
}
 
int main()
{
    printf("Enter number:");
    int n;
    scanf("%d",&n);
    printf("The number of 1's is:");
    counts(n);
    return 0;
}