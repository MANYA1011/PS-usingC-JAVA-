package com.manya;

import java.util.Scanner;

public class populatearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int x=1,i=0,k=0,l=n-1;
        while(i!=n-1)
        {
            if(x%2!=0){
            a[k]=x;
            k++;}
            else{
            a[l]=x;
            l--;}
            x++;
            i++;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
