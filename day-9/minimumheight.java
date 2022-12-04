package com.manya;

import java.util.Scanner;
public class minimumheight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int area=sc.nextInt();
        int height;
        height=(int)Math.ceil((2*area)/base);
        System.out.println(height);
    }
}
