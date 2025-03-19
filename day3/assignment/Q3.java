package day3.assignment;

import java.util.Scanner;

// Write a function that checks whether a given number is an Armstrong number.

public class Q3 {

    public static int getLength(int n){
        int count = 0;
        int temp = n;
        while (temp>0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static boolean isArmstrong(int n){
        int length = getLength(n);
        int sum = 0; 
        int temp = n;

        while (temp>0) {
            int digit = temp%10;
            int power = 1;

            for(int i = 0; i<length; i++){
                power *=digit;
            }

            sum += power;

            temp /=10;
        }

        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n) ? "yes" : "no");
        sc.close();

    }
}
