#include<stdio.h>
void main()
{
    int i,j,n,m;char ch='A';
    printf("enter range of pattern\n");
    scanf("%d",&n);
    for(i=65;i<=n;i++)
    {
        m=i;
        for(j=65;j<=i;j++)
        {
            printf("%c",m);
            m++;
        }
        if(m!=66)
        m--;
        printf("\n");
    }
}
