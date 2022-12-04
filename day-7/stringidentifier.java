package com.manya;

import javax.swing.*;
import java.util.Scanner;

public class stringidentifier{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();int i,c=0;
        String r=s;
       if(s.charAt(0)!=' '|| s.charAt(0)>='a' && s.charAt(0)<='z' || s.charAt(0)>='A' && s.charAt(0)<='Z' || s.charAt(0)=='_') {
           for (i = 1; i < s.length(); i++) {
               if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                       || s.charAt(i) >= 48 && s.charAt(i) <= 57 || s.charAt(i) != ' ') {
                   c++;
               }
           }
       }
           if(c==s.length()){
               System.out.println("valid identifier");}
           else{
               System.out.println("not valid");}
    }
}
