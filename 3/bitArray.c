//Date : 12/09/24
//Take an unsigned integer x=0
//Let user give an array of values where each element can be anywhere from 1 to 32 , the corresponding integer should be returned

Those elements represent the bit positions in the unsigned integer to be set as 1
#include<stdio.h>
#include<stdlib.h>
unsigned int setBits(int array[],int size){

    unsigned int x =0;

    for(int i=0;i<size;i++){

        int pos = array[i];
        unsigned int mask = 1U<<(pos-1);
        x=x|mask;

    }
    return x;

}


int main(){

    int size;
    printf("Enter size of the array : ");
    scanf("%d",&size);

    int *array = (int*) malloc(size* sizeof(int));
    if(array==NULL) {
        printf("Memory allocation failed!");
        return 1;
    }

    printf("Enter bit positions that needs to be 1 : ");
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);

        if(array[i]<0 || array[i]>32){
            printf("Position out of bound!");
            free(array);
            return 1;
        }
    }

    unsigned int result = setBits(array,size);
    printf("Resulting integer : %u\n",result);
    free(array);
    return 0;
    
}

//Difficulty level : 30%  
