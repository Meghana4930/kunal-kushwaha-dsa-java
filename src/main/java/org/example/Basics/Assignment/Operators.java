package org.example.Basics.Assignment;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char op=sc.next().charAt(0);
        if(op=='+'){
            System.out.println(num1+num2);
        }
        else if(op=='-'){
            System.out.println(num1-num2);
        }
        else if(op=='*'){
            System.out.println(num1*num2);
        }
        else if(op=='/'){
            System.out.println(num1/num2);
        }
    }
}
