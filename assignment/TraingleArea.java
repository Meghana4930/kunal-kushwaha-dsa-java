package org.example.loops.assignment;

import java.util.Scanner;

public class TraingleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double area=0.5*(base*height);
        System.out.println("The area of the triangle is "+area);
    }
}
