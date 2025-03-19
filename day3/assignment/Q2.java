package day3.assignment;

// Write a function that takes two integers a and b and returns their GCD.
public class Q2 {
    public static int gcd(int a, int b){
        int n=0;
        while(a!=0){
            n=a;
            a=b%a;
            b=n;
        }
        return b;
    }
    public static void main(String[] args) {
        int a=225;
        int b=25;
        System.out.println(gcd(a,b));
    }
}
