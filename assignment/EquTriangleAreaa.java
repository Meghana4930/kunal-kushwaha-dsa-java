package org.example.loops.assignment;

import java.util.Scanner;

public class EquTriangleAreaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double area=Math.sqrt(3)/4*side*side;
        System.out.println("The area of the equilateral triangle is "+area);
    }
}
