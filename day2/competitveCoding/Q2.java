package day2.competitveCoding;

import java.util.Scanner;

// Q2. Smart Traffic Light System
// Problem Statement: 
// A smart traffic system follows these rules:

// Morning (6 AM - 12 PM): Red for 30s, Yellow for 5s, Green for 25s.
// Afternoon (12 PM - 6 PM): Red for 40s, Yellow for 7s, Green for 20s.
// Night (6 PM - 6 AM): Red for 50s, Yellow for 10s, Green for 15s.
// Write a Java program that:

// Takes the current hour (0-23) and the elapsed time (0-100s).
// Determines the current traffic light color.

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current hour (0-23): ");
        int hour = sc.nextInt();
        System.out.print("Enter elapsed time (0-100s): ");
        int time = sc.nextInt();

        if (hour < 0 || hour > 23 || time < 0 || time > 100) {
            System.out.println("Invalid input!");
            return;
        }

        int red, yellow, green;

        if (hour >= 6 && hour < 12) {
            red = 30;
            yellow = 5;
            green = 25;
        } else if (hour >= 12 && hour < 18) {
            red = 40;
            yellow = 7;
            green = 20;
        } else {
            red = 50;
            yellow = 10;
            green = 15;
        }

        int cycle = red + yellow + green;
        int position = time % cycle;

        if (position < red) {
            System.out.println("Current Light: RED");
        } else if (position < red + yellow) {
            System.out.println("Current Light: YELLOW");
        } else {
            System.out.println("Current Light: GREEN");
        }

        sc.close();
    }
}
