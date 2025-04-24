package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test adding valid item")
    void testAddValidItem() {
        cart.addItem("Apple", 1.25);
        assertEquals(1.25, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test adding item with negative price (expect exception)")
    void testAddNegativePrice() {
        assertThrows(IllegalArgumentException.class,
                     () -> cart.addItem("Banana", -0.50));
    }

    @Test
    @DisplayName("Test applying SAVE10")
    void testApplySave10() {
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test total cost without discount")
    void testTotalWithoutDiscount() {
        cart.addItem("A", 2.0);
        cart.addItem("B", 3.0);
        assertEquals(5.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test total cost with discount")
    void testTotalWithDiscount() {
        cart.addItem("X", 100.0);
        cart.applyDiscountCode("SAVE20");
        assertEquals(80.0, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    void testTotalEmptyCart() {
        assertEquals(0.0, cart.getTotalCost());
    }
}
