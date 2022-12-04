package com.manya;

import java.util.Scanner;

public class uppertolower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),r="";
        int i;char ch;
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch>=97 && ch<=122)
                ch = (char) (ch - 32);
            r=r+ch;

        }
        System.out.println(r);
    }
}
