package com.manya;
import java.util.Scanner;
public class arm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            boolean r=armstrong(i);
            if(r==true)
                System.out.println(i+" is armstrong");
        }
    }
    public static int digit(int x)
    {
        int n=x,d,c=0;
        while(x>0) {
            d = x % 10;
            x = x / 10;
            c++;
        }
        return c;

    }
    public static boolean armstrong(int x)
    {
        int n=x,d,s=0,cu;
        while(x>0)
        {
            d=x%10;
            x=x/10;
            int c=digit(n);
            cu=(int)Math.pow(d,c);
            s=s+cu;
        }
        if(s==n)
            return true;
        else return false;
    }
}
