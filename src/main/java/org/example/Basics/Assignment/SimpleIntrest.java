package org.example.Basics.Assignment;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long p=sc.nextLong();
        int t=sc.nextInt();
        float r=sc.nextFloat();
        double s=(p*t*r)/100;
        System.out.println(s);
    }
}
