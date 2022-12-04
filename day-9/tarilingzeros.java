package com.manya;

import java.util.Scanner;

public class tarilingzeros
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long i,d,d1,c=0;
        long p=1;
        for(i=1;i<=n;i++)
        {
            p=p*i;
        }
        while(p!=0)
        {
            d=p%10;
            d1=p%100;

            if(d==0 && d1==0)
            {
                c=c+2;
                p=p/100;
            }
            else if(d==0 && d1!=0)
            {
                c++;
                p=p/10;
            }
            else if(d!=0)
            {
                break;
            }
        }
        System.out.println(c);
    }
}
