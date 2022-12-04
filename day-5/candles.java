package com.manya;

import java.util.Scanner;

public class candles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0,i;
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
           if(max<a[i]){
               max=a[i];
           }
       }
        System.out.println(max);
    }
}
