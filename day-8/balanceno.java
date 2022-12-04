package com.manya;

import java.util.Scanner;

public class balanceno {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n,l=0,sr=0,sl=0;
        while(n!=0){
            n=n/10;
            l++;
        }
       int[] a=new int[l];
        int c=l/2;
        for(int i=l-1;i>=0;i--)
        {
            a[i]=num%10;
            num=num/10;
        }
        for(int i=0;i<c;i++)
        {
            sr=sr+a[i];
        }
        for(int i=l-1;i>c;i--)
        {
            sl=sl+a[i];
        }
        System.out.println("right sum= "+sr);
        System.out.println("left sum= "+sl);
    }
}
