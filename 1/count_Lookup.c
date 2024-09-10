#include <stdio.h>


void initialize_BitCount(int bitCountLookup[256]) {
    for (int i = 0; i < 256; i++) {
        bitCountLookup[i] = (i & 1) + bitCountLookup[i >> 1];
    }
}


int count_LookupTable(unsigned int n, int bitCountLookup[256]) {
    int count = 0;
    while (n) {
        count += bitCountLookup[n & 0xFF];  
        n >>= 8;  
    }
    return count;
}

int main() {
    int bitCountLookup[256];
    initialize_BitCount(bitCountLookup);

    unsigned int number=15 ;
    printf("Number of 1s in binary representation: %d\n", count_LookupTable(number, bitCountLookup));
    return 0;
}
