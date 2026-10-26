package org.example.loops;

import java.util.Scanner;

public class NumberFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int key=sc.nextInt();
        int count=0;
        while(n>0){
            long last=n%10;
            if(last==key){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
