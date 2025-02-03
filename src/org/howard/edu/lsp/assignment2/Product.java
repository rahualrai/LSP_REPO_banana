/**
 * Name: Rahual Rai
 */
package src.org.howard.edu.lsp.assignment2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    int id;
    String name;
    double price;
    String category;
    String priceRange;
    
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void transform() {
        name = name.toUpperCase();
        if (category.equalsIgnoreCase("Electronics")) {
            price = round(price * 0.9, 2); // apply 10% discount first
            if (price > 500) { // then categorize
                category = "Premium Electronics";
            }
        }
        if (price <= 10) {
            priceRange = "Low";
        } else if (price <= 100) {
            priceRange = "Medium";
        } else if (price <= 500) {
            priceRange = "High";
        } else {
            priceRange = "Premium";
        }
    }

    // referenced from: https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String toCSV() {
        return id + "," + name + "," + String.format("%.2f", price) + "," + category + "," + priceRange;
    }
}
