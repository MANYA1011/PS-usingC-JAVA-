#include<stdio.h>
void main()
{
    int i,j,k,l,m,n;
    printf("enter size of pattern\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=n;j>i;j--)
        {
            printf(" ");
        }
        for(k=1;k<=i;k++)
        {
            printf("*");
        }
        m=j;
        for(l=1;l<=m-1;l++)
            printf("*");
        printf("\n");
    }

}
