package com.manya;

import java.util.Scanner;

public class circletorectangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double l,b,d,arear=0.0;
        d=2*r;
        b=Math.sqrt(r*r+r*r);
        l=Math.sqrt(d*d-b*b);
        arear=l*b;
        System.out.println("maximum area of rectangle is: "+arear);
    }
}
