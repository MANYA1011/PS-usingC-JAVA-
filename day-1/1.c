#include<stdio.h>
void main()
{
    int a,b,c;
    printf("enter 3 numbers\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b)
    {
        if(a>c)
            printf("%d",a);
        else
            printf("%d",c);
    }
    else
    {
        if(b>c)
            printf("%d",b);
        else
            printf("%d",c);
    }
}
