package SRP;

import java.util.Scanner;

public class PriceCalculator {
    // Single Responsibility Principle (SRP) Example
    // Class with single responsibility: Price Calculation
    public static double applyDiscount(double price, double discountPercent) {
        // method to apply a discount to a price
        return price - (price * discountPercent / 100);
    }
}

class Client {
    // Client class to demonstrate the usage of PriceCalculator
    // It prompts the user for a price and a discount percentage, then calculates the final price
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");    
        double discountPercent = scanner.nextDouble();

        // Using PriceCalculator to apply discount
        double finalPrice = PriceCalculator.applyDiscount(originalPrice, discountPercent);

        System.out.println("Final price after discount: " + finalPrice);

        scanner.close();
    }
}
