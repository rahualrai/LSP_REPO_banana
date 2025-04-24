package org.howard.edu.lspfinal.question1;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            System.out.println("Attempting to add an item with price 0...");
            cart.addItem("Free Item", 0.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}