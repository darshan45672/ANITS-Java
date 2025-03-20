package day4.trails;

import java.util.Scanner;
// write a program to find the reverse of a string without using inbuilt functions
// and print the reverse string

public class Q1 {
    public static void main(String[] args) {
        String a = "hello",rev="";
        char[] ch = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            rev=ch[i]+rev;
        }
        System.out.println(rev);
    }

}
