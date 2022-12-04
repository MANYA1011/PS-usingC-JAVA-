#include<stdio.h>
void main()
{
    int i,j,k=1,m,n,l;
    printf("enter size of pattern\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(l=n;l>i;l--)
        printf(" ");
        k=i;
        for(j=1;j<=i;j++)
        {
            printf("%d",k);
            k++;
        }
        if(i!=1)
        {
        for(m=1;m<=i-1;m++)
        {
            printf("%d",k-2);
            k--;
        }
        }
        printf("\n");

    }
}
