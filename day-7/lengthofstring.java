package com.manya;

import java.util.Scanner;
import java.lang.String;
public class lengthofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0,c=0;
        char ch=s.charAt(i);
        while(ch!='0'){
            ch=s.charAt(i);
            s=s.replace(ch,'0');
            i++;
            }

        System.out.println(i);
    }
}
