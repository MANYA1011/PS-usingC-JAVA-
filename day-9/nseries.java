package com.manya;
import java.util.Scanner;
public class nseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,s=0;
        for(i=1;i<=n;i++) {
            int p = 1;
            for (j = i; j < i + 3; j++) {
                p = p * j;
            }
            s = s + p;
        }
        System.out.println(s);
    }
}
