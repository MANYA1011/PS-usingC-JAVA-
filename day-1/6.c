#include<stdio.h>
void main()
{
    float temp;
    printf("enter temperature in degree celsius\n");
    scanf("%f",&temp);
    if(temp<=0)
        printf("freezing\n");
    else if (temp>0 && temp<10)
        printf("chilling\n");
    else if(temp>=10 && temp<20)
        printf("cold\n");
    else if(temp>=20 && temp<30)
        printf("normal\n");
    else if(temp>=30 && temp<40)
        printf("hot\n");
    else
        printf("very hot\n");
}
