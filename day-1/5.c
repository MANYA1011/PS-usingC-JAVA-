#include<stdio.h>
void main()
{
    float sal,bs,hra,da,pf,all,tot;
    char ch;
    printf("enter basic salary\n");
    scanf("%f",&bs);
    printf("enter grade\n");
    fflush(stdin);
    scanf("%c",&ch);
    hra=.15*bs;
    da=.5*bs;
    pf=.11*bs;
    if(ch=='A')
        all=1700;
    else if(ch=='B')
        all=1500;
    else if(ch=='C')
        all=1300;
    tot=bs+hra+da+all-pf;
    printf("%f",tot);
}
