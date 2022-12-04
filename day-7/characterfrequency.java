package com.manya;

import java.util.Scanner;

public class characterfrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,j,c;
        char ch;
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            c=0;
            for(j=0;j<s.length();j++){
                if(ch==s.charAt(j))
                {
                    c++;
                }
            }
            System.out.println("frequency of "+ch+" is:"+c);
        }
    }
}
