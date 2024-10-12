//Basic string operations
//Program to print a string
void s1(){
    printf("Enter string to be printed:");
    char s[25];
    scanf("%s",&s);
    printf("The string is:");
    printf("%s",s);
}
#include<string.h>
//Program to print the length of a string
void s2(){
    printf("Enter string:");
    char s[25];
    scanf("%s",&s);
    int l=strlen(s);
    printf("The length of string is:");
    printf("%d",l);
}
//Program to copy a string
void s3(){
    printf("Enter string to be copied:");
    char s[25];
    char s1[25];
    scanf("%s",&s);
    strcpy(s1,s);
    printf("The copied string is:");
    printf("%s",s1);
}
//Program to reverse a string
void s4(){
    printf("Enter string to be reversed:");
    char s[25];
    scanf("%s",&s);
    printf("The reversed string is:");
    for(int i=strlen(s);i>=0;i--){
        printf("%c",s[i]);
    }
}
//Program to concatenate two strings
void s5(){
    printf("Enter strings:");
    char s1[25];
    char s2[25];
    scanf("%s%s",&s1,&s2);
    strcat(s1,s2);
    printf("%s",s1);

}
//Program to compare two strings
void s6(){
    printf("Enter strings:");
    char s1[25];
    char s2[25];
    scanf("%s%s",&s1,&s2);
    printf("%d",strcmp(s1,s2));    
}

//Length of the string without using strlen() function
void length(){
    printf("Enter string:");
    char s1[25];
    scanf("%s",&s1);
    int i=0;
    int count=0;
    while(s1[i]!='\0'){
        count++;
        i++;
    }
    printf("Lenght of string is:%d",count);
}

//Toggle each character in a string
void toggle(){
    printf("Enter string:");
    char s1[25];
    scanf("%s",&s1);
    for(int i=0;i<strlen(s1);i++){
        if(s1[i]>='A' && s1[i]<='Z'){
            printf("%c",(s1[i]+32));
        }
        else if(s1[i]>='a' && s1[i]<='x'){
            printf("%c",(s1[i]-32));
        }
    }
}

//Count the number of vowels
void cou(){
    printf("Enter string:");
    char s1[25];
    scanf("%s",&s1);
    int count=0;
    for(int i=0;i<strlen(s1);i++){
        if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'){
            count++;
        }
    }
    printf("The number of vowels is:%d",count);
}

//Remove vowels from a string
void removve(){
    printf("Enter string:");
    char s1[25];
    scanf("%s",&s1);
    int count=0;
    for(int i=0;i<strlen(s1);i++){
        if(s1[i]!='a'||s1[i]!='e'||s1[i]!='i'||s1[i]!='o'||s1[i]!='u'){
            printf("%c",s1[i]);
        }
        else{
            printf("");
        }
    }
}
