#include<stdio.h>
void main()
{
    int i,j,n;
    printf("enter a number\n");
    scanf("%d",&n);
    i=0;
    for(j=0;j<n+2;j++)
    {
        printf("%d",n);
    }
    j=0;
    for(i=1;i<=n;i++)
    {
        printf("\n%d",n);
    }
    i=n+1;
    for(j=1;j<=n;j++)
    {
        printf("%d",n);
    }
     j=n+1;
    for(i=n+1;i>=1;i--)
    {
        printf("%d",n);
    }

}
