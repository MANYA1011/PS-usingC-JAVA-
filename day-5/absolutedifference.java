package com.manya;

import java.util.Scanner;

public class absolutedifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int i, result = 0;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] < k)
            {
                result = diff(a[i]);
            if (result == 1)
                System.out.println(a[i]);
            }
        }
    }

    public static int diff(int x) {
        int i, d, d1, dif = 0, r = 0, n, c = 0,y;
        n = x;
        while (x !=0) {
            x = x / 10;
            r++;
        }
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            if(n==0)
                break;
            d1 = n % 10;

            if (d - d1 == 1 || d-d1==-1) {
                c++;
            }
            else
                break;
        }
        if (c == r- 1)
            return 1;
        else
            return 0;
    }
}
