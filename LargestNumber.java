package org.example.loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=Math.max(n1,n2);
        max=Math.max(max,n3);
        System.out.println(max);
    }
}
