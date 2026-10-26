package org.example.loops.assignment;

import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int i=1;
        while(i<=n){
            System.out.println(a);
           int num=a+b;
           a=b;
           b=num;

           i++;


        }
    }
}
