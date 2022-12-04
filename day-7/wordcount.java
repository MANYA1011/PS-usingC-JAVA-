package com.manya;

import java.util.Scanner;

public class wordcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),r="";
        int c=0,i;
        char ch;
for(i=0;i<s.length();i++){
    if(s.charAt(i)==' ')
        c++;
    else
        continue;
}
System.out.println(c+1);
    }
}
