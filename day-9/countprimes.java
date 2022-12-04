package com.manya;

import java.util.Scanner;

public class countprimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c,count=0;
        if(n==0)
        {
            System.out.println("0");
        }
        for(int i=2;i<n;i++)
        {
            c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                count++;
            }
        }
       System.out.println(count);
    }
    }

