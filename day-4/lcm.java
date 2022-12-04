package com.manya;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r;
        int m=sc.nextInt();
        if(n>m)
        r=lc(n,m);
        else
            r=lc(m,n);
        int lcm=(n*m)/r;
        System.out.println(lcm);
    }
    public static int lc(int x,int y)
    {
        if(x%y==0)
            return y;
        else
        {
           return lc(y,x%y);
        }
    }
}
