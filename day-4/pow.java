package com.manya;
import java.util.Scanner;
public class pow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int p=power(a,b);
        System.out.println(p);
    }
    public static int power(int x,int y){
        if(y==1)
            return x;
        else return x*power(x,y-1);
    }
}
