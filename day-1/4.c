#include<stdio.h>
void main()
{
    int a,b,c;
    printf("enter 3 sides\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a==b&&b==c&&c==a)
        printf("equilateral\n");
    else if(a==b||b==c||c==a)
        printf("isosceles\n");
    else if(a!=b&&b!=c&&c!=a)
        printf("scalene\n");
}
