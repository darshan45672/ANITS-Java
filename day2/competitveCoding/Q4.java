package day2.competitveCoding;

import java.util.Scanner;

// Problem Statement:
// A number is a palindrome if it reads the same forwards and 
// backwards.

// However, in an advanced system:

// A prime palindrome (both palindrome and prime) is considered 
// a "Super Number".
// Any non-palindrome prime is considered a "Normal Prime".
// Otherwise, the number is "Not Special".
// Write a Java program to categorize a number based on the above 
// conditions.

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        boolean isPalindrome = (rev == num);

        boolean isPrime = num > 1;
        for (int i = 2; i * i <= num && isPrime; i++) {
            if (num % i == 0)
                isPrime = false;
        }

        if (isPalindrome && isPrime) {
            System.out.println("Super Number (Prime Palindrome)");
        } else if (isPrime) {
            System.out.println("Normal Prime");
        } else {
            System.out.println("Not Special");
        }

        sc.close();
    }
}
