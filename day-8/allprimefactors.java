package com.manya;

import java.util.Scanner;

public class allprimefactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), r = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                r = prime(i);
                if (r == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    static int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
            return 1;
        else
            return 0;
    }
}
