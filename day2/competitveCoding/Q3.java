package day2.competitveCoding;

import java.util.Scanner;

// // Problem Statement:
// An ATM machine accepts a 4-digit PIN only if:

// It is exactly 4 digits.
// It contains at least one even and one odd digit.
// The sum of all digits must be divisible by 4.






























public class Q3 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit PIN: ");
        int pin = sc.nextInt();

        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN! Must be 4 digits.");
            return;
        }

        int sum = 0;
        boolean hasEven = false, hasOdd = false;
        int temp = pin;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            if (digit % 2 == 0) hasEven = true;
            else hasOdd = true;
            temp /= 10;
        }

        if (sum % 4 == 0 && hasEven && hasOdd) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
        sc.close();
    }
}
