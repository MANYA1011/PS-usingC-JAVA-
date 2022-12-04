package com.manya;

import java.util.Scanner;

public class reversethestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        int i,l=s.length();
        for(i=0;i<l;i++){
            r=s.charAt(i)+r;
        }
                System.out.println(r);
        if(r.equalsIgnoreCase(s)==true)
System.out.println("palindrome");
        }
}

