package com.manya;

import java.util.Scanner;

public class rootsofequation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        double r1=0.0,r2=0.0;
        if(d>0)
        {
            r1=(-b+Math.sqrt(d))/2*a;
            r2=(-b-Math.sqrt(d))/2*a;
            System.out.println("roots are: "+r1+" "+r2);
        }
        else if(d==0)
        {
            r1=r2=(-b)/2*a;
            System.out.println("roots are: "+r1+" "+r2);
        }
        else if(d<0)
        {
            System.out.println("roots are complex");
        }
    }

}
