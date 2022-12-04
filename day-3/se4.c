#include<stdio.h>
void main()
{
    int i,j,x,n,f;float s=1;
    printf("enter limit of series\n");
    scanf("%d",&n);
    printf("enter x\n");
    scanf("%d",&x);
    for(i=1;i<=n;i++)
    {
        f=1;
        for(j=1;j<=i;j++)
        {
            f=f*j;
        }
        if(i%2!=0)
            s=s-pow(x,i)/f;
        else
            s=s+pow(x,i)/f;
    }
    printf("%f",s);
}
