package com.manya;

import java.util.ArrayList;
import java.util.Scanner;

public class selfdividing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int range=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int i,r;
        for(i=num;i<=range;i++)
        {
            r=selfdivide(i);
            if(r==1)
            {
                list.add(i);
            }
        }
        System.out.println(list);
            //System.out.println(n+" is self dividing");
            //System.out.println(n+" is not self-dividing");
    }

 public static int selfdivide(int num)
    {
        int i,d,n,c=0,count=0;
        n=num;
        while(n!=0){
            n=n/10;
            c++;
        }
        n=num;
        while(num!=0){
            d=num%10;
            if(n%d==0 && d!=0)
            {    count++;
            }
            num=num/10;
        }
        if(count==c)
            return 1;
        else
        return 0;
    }
}
