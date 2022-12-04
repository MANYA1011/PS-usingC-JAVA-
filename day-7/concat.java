package com.manya;

import java.awt.*;
import java.util.Scanner;

public class concat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine(),r="";
        int i;
        for(i=0;i<s1.length();i++){
            r=r+s1.charAt(i);
        }
        for(i=0;i<s2.length();i++){
            r=r+s2.charAt(i);
        }
        System.out.println(r);
    }
}
