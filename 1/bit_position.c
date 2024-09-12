/*Take an unsigned integer x=0

Let user give an array of values where each element can be anywhere from 1 to 32

Those elements represent the bit positions in the unsigned integer to be set as 1*/

//12-09-2024
#include <stdio.h>

int main() {
    unsigned int x = 0;  
    int n;                    
    int i;

    printf("Enter the number of bit positions: ");
    scanf("%d", &n);

    int positions[n];    

    printf("Enter the bit positions (1 to 32):\n");
    for (i = 0; i < n; i++) 
    {
        scanf("%d", &positions[i]);
    }

    for (i = 0; i < n; i++) 
    {
        int bit_position = positions[i];
        if (bit_position >= 1 && bit_position <= 32) 
        {
            x |= (1U << (bit_position - 1)); 
        } else 
        {
            printf("Bit position %d is out of range. Valid range is 1 to 32.\n", bit_position);
        }
    }
    printf("Resulting value in binary:\n");
    for (i = 31; i >= 0; i--)
    {
        printf("%d", (x >> i) & 1);
        if (i % 4 == 0) printf(" "); 
    }
    printf("\n");
    printf("Resulting value in decimal: %u\n", x);

    return 0;
}
//difficulty rate: 80
