package com.manya;

import java.util.Scanner;

public class swaparray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,temp=0;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i==n-2)
            {
                break;
            }
            temp=a[i+2];
            a[i+2]=a[i];
            a[i]=temp;

        }
        for(i=0;i<n;i++){
        System.out.println(a[i]);}
    }
}
