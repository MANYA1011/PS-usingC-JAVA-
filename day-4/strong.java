package com.manya;
import java.util.Scanner;
public class strong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            boolean r=str(i);
            if(r==true)
                System.out.println(i+" is Strong");
        }
    }
    public static int fact(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static boolean str(int x)
    {
        int n=x,s=0,d,f;
        while(x>0)
        {
            d=x%10;
            x=x/10;
            f=fact(d);
            s=s+f;
        }
        if(s==n)
            return true;
        else return false;
    }
}
