#include<stdio.h>
void main()
{
    int i,j,k,n,c=1;
    printf("enter no of rows\n");
    scanf("%d",&n);
     for(i=1;i<=n;i++)
     {
         k=i;
         for(j=1;j<=i;j++)
         {
             printf("%d",k);
             k++;
         }
         printf("\n");
     }
}
