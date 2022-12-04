package com.manya;

import java.util.Scanner;

public class chocolate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];int x,i,st,end,f,l;
        System.out.println("enter array");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        f=a[0];
        l=a[n-1];
        /*if(f>l)
            x=f;
        else
            x=l;*/
        st=0;end=n-1;
        while(st<end){
            if(a[st]<a[end])
                end--;
            else
                st++;
        }
        if(st==end)
        System.out.println(a[st]);
    }
}
