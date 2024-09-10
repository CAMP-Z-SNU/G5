//Date : 10/09/24
//Count number of 1s in a binary number , 2nd approach
#include <stdio.h>

void CountbitTable(int table[16]) {
    
    for (int i = 0; i < 16; i++) {
        int count = 0;
        int value = i;
        while (value) {
            count += value & 1;
            value >>= 1;
        }
        table[i] = count;
    }
}

int countOnes(unsigned int number, const int table[16]) {
    
    int count = 0;
    while (number != 0) {

        int chunk = number & 0xF;  
        count += table[chunk]; 
        number >>= 4; 

    }
    return count;
}

int main() {

    int table[16];
    CountbitTable(table); 
    
    unsigned int number;
    printf("Enter n: ");
    scanf("%u", &number); 
    
    int result = countOnes(number, table);
    
    printf("Number of 1s in %u (binary %08X) is: %d\n", number, number, result);
    
    return 0;
}

//Difficulty level : 80%
