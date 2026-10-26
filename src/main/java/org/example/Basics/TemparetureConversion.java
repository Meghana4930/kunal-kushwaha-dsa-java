package org.example.Basics;

import java.util.Scanner;

public class TemparetureConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the celsius tempareture");
        float celsius=sc.nextFloat();
        double farah=((celsius*9)/5)+32;
        System.out.println(farah);

    }
}
