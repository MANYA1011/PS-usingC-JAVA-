package com.manya;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int f=fact(num);
        System.out.println(f);
    }
    public static int fact(int x)
    {
        if(x==1)
            return x;
        else
            return x*fact(x-1);
    }
}
