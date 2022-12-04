package com.manya;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            boolean r=pr(i);
            if(r==true)
            System.out.println(i+" is prime");
        }
    }
    public static boolean pr(int x)
    {
        int i,c=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
                c++;
        }
        if(c==2)
            return true;
        else return false;
    }
}
