#include<stdio.h>
void main()
{
    int i,j,m,c,n;
    printf("enter range of pattern\n");
    scanf("%d",&n);
    m=n;c=0;
    for(i=65;i<=n;i++)
    {

        for(j=65;j<=i;j++)
        {
            printf("%c",m);
            m++;
        }
        c++;
       m=m-c-1;
        printf("\n");
    }

}

