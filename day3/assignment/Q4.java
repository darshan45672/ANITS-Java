package day3.assignment;

import java.util.Scanner;

// Write a function that returns the number of set bits (1s in binary representation) of an integer.
public class Q4 {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
        sc.close();
    }
}
