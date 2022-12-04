#include<stdio.h>
void main()
{
    int i,j,n,m,l,k,sp,a,x=0;
    printf("enter size of pattern\n");
    scanf("%d",&n);
    m=n;a=m;
    for(i=1;i<=n;i++)
    {

        for(j=1;j<=m;j++)
        {
            printf("%d ",j);
        }


     if(i==1)
     {
         a=m-1;
     }
     else{
        a=m;
     }
     if(i>1)
     {
     for(sp=1;sp<i+(3*x)-2;sp++)
     {
         printf(" ");
     }
     }
     for(k=a;k>=1;k--)
     {
         printf("%d ",k);
     }
     m--;x++;
     printf("\n");
    }

}
