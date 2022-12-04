#include<stdio.h>
void main()
{
    int i,j,n,m,sp,x,y;
    printf("enter size of pattern\n");
    scanf("%d",&n);
    m=n;

    for(i=1;i<=n;i++)
    {
        if(i>1)
        {
            for(sp=1;sp<i;sp++)
            {
                printf(" ");
            }
        }
        for(j=1;j<=m;j++)
        {
            printf("*");
        }
        m=m-2;
    printf("\n");
    }
    m=n-3;x=n-2;y=m;
    for(i=1;i<=m;i++)
    {
        for(sp=1;sp<i;sp++)
        {
            printf(" ");
        }
        for(j=1;j<=x;j++)
        {
            printf("*");
        }
        x=x+2;y--;
        printf("\n");
    }


}
