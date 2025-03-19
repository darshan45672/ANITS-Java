package day3.assignment;
// Write a function that takes two integers L and R as input and prints all prime numbers between L and R.

import java.util.*;
public class Q1 {
    public static void prime(int l,int r){
        for(int i=l;i<(r+1);i++){
            if((i-1)%6==0 || (i+1)%6==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        prime(sc.nextInt(),sc.nextInt());
        sc.close();
    }
    
}
