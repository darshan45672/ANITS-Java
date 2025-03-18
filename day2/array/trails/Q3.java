package day2.array.trails;

// A customer wants to check if a specific item is available in stock. You are given an array of product IDs, and the task is to determine if a particular product ID is in stock.

public class Q3 {
    public static boolean isProductAvailable(int[] productIds, int productId) {
        for (int id : productIds) {
            if (id == productId) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] productIds = {101, 102, 103, 104, 105};
        int productId = 104;

        boolean isProductInStock = isProductAvailable(productIds, productId);
        if (isProductInStock) {
            System.out.println("Product is in stock");
        } else {
            System.out.println("Product is not in stock");
        }
    }
}
