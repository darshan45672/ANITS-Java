// Functions , Function types and using different types of functions in java

package day3.trails;

public class Q1 {

    public static void sum(Double a, Double b){
        System.out.println("a + b = " + (a + b));
    }
    public static void sum(Integer a, Integer b){
        System.out.println("a + b = " + (a + b));
    }
    public static Float sum(Float a, Float b){
        return a + b;
    }

    public static void main(String[] args) {
        Double a = 10.0;
        Double b = 10.0;

        sum(a,b);
        sum((int)(long)(float)(double)(a), (int)(long)(float)(double)(b));
        System.out.println("a + b = " +  sum((float)(double)(a), (float)(double)(b)));

    }
}