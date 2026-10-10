package org.example.Basics.Assignment;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int original = num;
            int temp = num;
            int digits = 0;
            int sum = 0;

            // Count the digits
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;

            // Calculate the sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            // Check Armstrong number
            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}