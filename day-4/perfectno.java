package com.manya;

import java.util.Scanner;

public class perfectno {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,s=0;
        long n=num;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==num)
           System.out.println("true");
        else
            System.out.println("false");
    }
}
