#include<stdio.h>
void main()
{
    int i,j,sp,m,n,l,a,x,k,c;

    printf("enter size of pattern\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(sp=n;sp>i;sp--)
      {
      printf(" ");
      }
        for(j=1;j<=i;j++)
        {
            printf("*");

        }
        m=j;c=0;
        if(i!=1)
        {
        for(l=1;l<m-1;l++)
        {

            printf("*");

        }
        }
        printf("\n");
    }
        if(n%2!=0)
            m=n;
        else
            m=n+1;
            if(n>4)
                m=m+2;
            for(i=1;i<=n-1;i++)
            {
                for(sp=1;sp<=i;sp++)
                    printf(" ");

        for(j=1;j<=m;j++)
        {
            printf("*");
        }
        m=m-2;
        printf("\n");
    }


    }

