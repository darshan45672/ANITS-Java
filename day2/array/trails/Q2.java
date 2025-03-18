package day2.array.trails;


// The company is analyzing the average monthly sales for a product. The sales data is represented as an array of integers, and the company wants to know the average sales value.

public class Q2 {
    public static double findAvgSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (double) sum / sales.length;
    }
 public static void main(String[] args) {
        int[] sales = {100, 200, 300, 400, 500};
        double avgSales = findAvgSales(sales);
        System.out.println("The average sales value is: " + avgSales);
 }   
}
