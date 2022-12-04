package com.manya;

import java.util.Scanner;

public class onedigitsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j,d,s=0,c=0,s1=0,r;
        while(num!=0){
            d=num%10;
            s=s+d;
            num=num/10;
        }
        r=s;
        while(r!=0){
            r=r/10;
            c++;
        }
        while(c!=1){
            c=0;
            while(s!=0){
                s1=s1+(s%10);
                s=s/10;
                c++;
            }
            if(c==1)
                break;
        }
        System.out.println(s1);

    }
}
