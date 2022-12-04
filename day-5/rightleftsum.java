package com.manya;

import java.util.Scanner;

public class rightleftsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j,mid,c=0,sr=0,sl=0,n;
        int[] a=new int[c];
        if(num%2!=0){
            while(num!=0){
                num=num/10;
                c++;
            }
        }
        mid=Math.ceilDiv(c,2);

    }
}
