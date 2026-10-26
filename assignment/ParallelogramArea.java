package org.example.loops.assignment;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.println("The area of the parallelogram is "+base*height);
    }
}
