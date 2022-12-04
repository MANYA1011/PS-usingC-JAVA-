package com.manya;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int gcd=gc(n,m);
        System.out.println(gcd);
    }
    public static int gc(int x,int y)
    {
        if(x%y==0)
            return y;
        else return gc(y,x%y);
    }
}
