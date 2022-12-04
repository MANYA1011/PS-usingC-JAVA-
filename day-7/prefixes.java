package com.manya;

import java.util.Scanner;

public class prefixes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String key=sc.nextLine(),w="";
        int i;
        char ch;
        for(i=0;i<s.length();i++){
            if(s.substring(i).equals(key)==true)
            {
              w=s.substring(0,i);
              break;
            }
            else
                continue;
        }
        System.out.println("prefix is:"+w);
        w="";
        for(i=0;i<s.length();i++){
            if(s.substring(i,key.length()).equals(key))
            {
                w=s.substring(key.length());
                break;
            }
        }
        System.out.println("suffix is:"+w);
    }
}
