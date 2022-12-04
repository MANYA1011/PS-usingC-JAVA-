#include<stdio.h>
void main()
{
    char ch;
    printf("enter an alphabet in lower case\n");
    scanf("%c",&ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        printf("vowel\n");
    else
        printf("consonant\n");
}
