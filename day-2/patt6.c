#include<stdio.h>
void main()
{
    int i,j,k,m,n,l;
    printf("enter size\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=n;j>i;j--)
            printf(" ");
            m=i;
        for(k=i;k>=1;k--)
        {
            printf("%d",m);
            m--;
        }
        if(i!=1)
        {
            for(l=2;l<=i;l++)
                printf("%d",l);
        }
        printf("\n");
    }
}
