package org.example.loops;

import java.util.Scanner;

public class ReverseNumber  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long rev=0;
        while(n>0){
            long last=n%10;
            rev=(rev*10)+last;
            n=n/10;

        }
        System.out.println(rev);
    }
}
