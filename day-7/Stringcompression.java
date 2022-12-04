package com.manya;
import java.util.Scanner;
public class Stringcompression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        int i,j,c=0;
        for(i=0;i<s.length();i++){
            for(j=i;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                    s1 = s.charAt(i) + s1;
                }
            }
                 System.out.println(s1);

        }
    }
}
