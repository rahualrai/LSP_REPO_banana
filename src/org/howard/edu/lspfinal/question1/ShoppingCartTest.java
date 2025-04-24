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
    @DisplayName("Test for adding valid item")
    void testAddValidItem() {
        cart.addItem("Apple", 1.25);
        assertEquals(1.25, cart.getTotalCost());
    }

    @Test
    @DisplayName("Test for adding item with 0 price (expect exception)")
    void testAddZeroPrice() {
        assertThrows(IllegalArgumentException.class,
            () -> cart.addItem("Freebie", 0.0));
    }

    @Test
    @DisplayName("Test for adding item with negative price (expect exception)")
    void testAddNegativePrice() {
        assertThrows(IllegalArgumentException.class, 
            () -> cart.addItem("Banana", -0.50));
    }

    @Test
    @DisplayName("Test for applying SAVE10")
    void testApplySave10() {
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test for applying SAVE20")
    void testApplySave20() {
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage());
    }

    @Test
    @DisplayName("Test for applying invalid discount code (expect exception)")
    void testApplyInvalidCode() {
        assertThrows(IllegalArgumentException.class,
            () -> cart.applyDiscountCode("SAVE50"));
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

