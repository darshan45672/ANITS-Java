package day3.trails;

public class O2 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        Integer c = 10;

        Integer res = ((a + b) * (c + ++a - c/a--) )/--c;

        System.out.println("Result = " + res);
    }
}
