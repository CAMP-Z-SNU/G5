#include <stdio.h>

int count_ones(int n) {
    return __builtin_popcount(n);
}

int main() {
    int num;
    printf("Enter an integer: ");
    scanf("%d", &num);
    int ones = count_ones(num);
    printf("Number of 1's in binary: %d\n", ones);
    return 0;
}
