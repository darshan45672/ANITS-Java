package day2.competitveCoding;

import java.util.Scanner;

// Q1. Number Encryption System
// Problem Statement: 
// A company encrypts a 4-digit number using the following method:
// Replace each digit D with (D + 7) % 10.
// Swap the first digit with the third and the second digit with the 
// fourth.
// The encrypted number is formed by joining these digits.
// Write a Java program that takes a 4-digit integer as input and prints 
// its encrypted form.


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input! Enter a 4-digit number.");
            // return;~
        }else{

            
            int d1 = (num / 1000 + 7) % 10; 
            int d2 = (num / 100 % 10 + 7) % 10; 
            int d3 = (num / 10 % 10 + 7) % 10;
        int d4 = (num % 10 + 7) % 10; 
        
        int encryptedNum = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        System.out.println("Encrypted Number: " + encryptedNum);
    }
        sc.close();
    }
}
