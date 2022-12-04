package com.manya;

import java.util.Scanner;

public class comparingthestrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int i,c=0,diff=0;
           if(s1.length()==s2.length()){
               for(i=0;i< s1.length();i++) {
                   if (s1.charAt(i) == s2.charAt(i)) {
                       c++;
                   }
                   else
                   {
                        diff=s1.charAt(i)-s2.charAt(i);
                   }
               }
if(c==s1.length())
    System.out.println("strings are equal");
else
    System.out.println("difference of first unequal character is:"+diff);
               }

               else
                   System.out.println("strings are not equal");
    }
}
