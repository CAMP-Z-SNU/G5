#include<stdio.h>
//Solid and hollow rectangle star pattern
void solidsquare(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("*");
        }
        printf("\n");
    }
}
void hollowsquare(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 ||i==(n-1) || j==(n-1))
            printf("*");
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
}

//Pyramid pattern using stars
//Half Pyramid Star Pattern
void pyramid1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            printf("*");
            
        }
        printf("\n");
    }
}
//Inverted Half pyramid
void pyramid2(int n){
    for(int i=n-1;i>=0;i--){
        for(int j=i;j>=0;j--){
            printf("*");
            
        }
        printf("\n");
    }
}
//Full Pyramid Star Pattern
void pyramid3(int n){
    int k=0;
    for(int i=1;i<n;i++){
        for (int j = 1; j <= 2 * (n - i); j++) {
            printf(" ");
        }
        for (int k = 1; k < 2 * i; k++) {
            printf("* ");
        }
        printf("\n");
    }
}
//Inverted Full pyramid
void pyramid4(int n){
    int k=0;
    for(int i=n;i>0;i--){
        for (int j = 2 * (n - i); j >=1 ; j--) {
            printf(" ");
        }
        for (int k = 2 * i; k >=1 ; k--) {
            printf("* ");
        }
        printf("\n");
    }
}

//Floyd's triangle
void floydstri(int n){
    int k=1;
    for(int i=1;i<n;i++){
        for (int j = 1; j <= i; j++) {
            printf("%d\t",k);
            k++;
        }
        printf("\n");

    }
}

//Pascal triangle
void pascalstri(int n){

    for (int line = 1; line <= n; line++) {
        for (int space = 1; space <= n - line; space++)
            printf("  ");
        int coef = 1;
        for (int i = 1; i <= line; i++) {
            printf("%4d", coef);
            coef = coef * (line - i) / i;
        }
        printf("\n");
    }
}
