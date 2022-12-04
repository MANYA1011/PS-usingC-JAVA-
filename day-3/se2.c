#include<stdio.h>
void main()
{
    int i,n,j,f,s=0;
    printf("enter size of series\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        f=1;
        for(j=1;j<=i;j++)
        {
            f=f*j;
        }
        s=s+f/i;
    }
    printf("%d",s);
}
