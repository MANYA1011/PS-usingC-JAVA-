#include<stdio.h>
void main()
{
    int i,j,n,k,sp,m,l;
    printf("enter size of pattern\n");
    scanf("%d",&n);
    m=2*(n-1);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",j);
        }
        for(sp=m;sp>=1;sp--)
            {
                printf(" ");
            }
            for(l=i;l>=1;l--)
                printf("%d",l);

        printf("\n");
        m=m-2;
    }

}
