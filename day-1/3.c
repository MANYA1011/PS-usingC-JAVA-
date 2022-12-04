#include<stdio.h>
void main()
{
    int y;
    printf("enter a year\n");
    scanf("%d",&y);
    if((y%4==0&&y%100!=0)||y%400==0)
        printf("leap year\n");
    else
        printf("not leap year\n");
}
