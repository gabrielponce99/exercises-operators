package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String food = "Tres Leches";
        double price = 4.99;
        int quantity = 5;
        double total = price * quantity;
        System.out.printf("You bought %d %s for %.2f", quantity, food, total);

    }
}
