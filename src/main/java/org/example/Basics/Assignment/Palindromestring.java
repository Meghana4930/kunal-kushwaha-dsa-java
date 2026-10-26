package org.example.Basics.Assignment;

import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("not palindrome");
                return;
            }

            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
