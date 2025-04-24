package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class IntegerSetTest {

	@Test
	@DisplayName("Test cases for toString method")
	void testToString() {

		IntegerSet testSet1 = new IntegerSet();

		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		assertEquals("[10, 15, 20, 25, 30]", testSet1.toString());

		IntegerSet testSet2 = new IntegerSet();
		assertEquals("[]", testSet2.toString());
	}

	@Test
	@DisplayName("Test cases for add method")
	void testAdd() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		assertEquals("[10, 15, 20, 25, 30]", testSet1.toString());
	}

	@Test
	@DisplayName("Test cases for clear method")
	void testClear() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);
		testSet1.clear();
		assertEquals("[]", testSet1.toString());

		IntegerSet testSet2 = new IntegerSet();
		testSet2.clear();
		assertEquals("[]", testSet2.toString());
	}

	@Test
	@DisplayName("Test cases for remove method")
	void testRemove() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		testSet1.remove(10);
		testSet1.remove(15);
		testSet1.remove(20);
		testSet1.remove(25);

		assertEquals("[30]", testSet1.toString());

		IntegerSet testSet2 = new IntegerSet();
		testSet2.remove(10);
		testSet2.remove(15);
		testSet2.remove(20);
		testSet2.remove(25);
		assertEquals("[]", testSet2.toString());
	}

	@Test
	@DisplayName("Test cases for length method")
	void testLength() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		Integer expectedLength1 = testSet1.length();
		assertEquals(5, expectedLength1);

		IntegerSet testSet2 = new IntegerSet();
		Integer expectedLength2 = testSet2.length();
		assertEquals(0, expectedLength2);
	}

	@Test
	@DisplayName("Test cases for diff method")
	void testDiff() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(15);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);

		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(10);
		testSet2.add(15);
		testSet2.add(20);
		testSet2.add(25);
		testSet2.add(30);

		testSet1.diff(testSet2);
		assertEquals("[35, 40, 45, 50]", testSet1.toString());

		IntegerSet testSet3 = new IntegerSet();
		testSet3.add(10);
		testSet3.add(15);
		testSet3.add(20);
		testSet3.add(25);
		testSet3.add(30);
		testSet3.add(35);
		testSet3.add(40);
		testSet3.add(45);
		testSet3.add(50);

		IntegerSet testSet4 = new IntegerSet();
		testSet3.diff(testSet4);
		assertEquals("[10, 15, 20, 25, 30, 35, 40, 45, 50]", testSet3.toString());

		IntegerSet testSet5 = new IntegerSet();
		IntegerSet testSet6 = new IntegerSet();
		testSet6.add(10);
		testSet6.add(15);
		testSet6.add(20);
		testSet6.add(25);
		testSet6.add(30);

		testSet5.diff(testSet6);
		assertEquals("[]", testSet5.toString());

		IntegerSet testSet7 = new IntegerSet();
		IntegerSet testSet8 = new IntegerSet();
		testSet7.diff(testSet8);
		assertEquals("[]", testSet7.toString());
	}

	@Test
	@DisplayName("Test cases for intersect method")
	void testIntersect() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);

		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(10);
		testSet2.add(15);
		testSet2.add(20);
		testSet2.add(25);
		testSet2.add(30);

		testSet1.intersect(testSet2);
		assertEquals("[10]", testSet1.toString());

		IntegerSet testSet3 = new IntegerSet();
		testSet3.add(10);
		testSet3.add(35);
		testSet3.add(40);
		testSet3.add(45);
		testSet3.add(50);

		IntegerSet testSet4 = new IntegerSet();
		testSet3.intersect(testSet4);
		assertEquals("[]", testSet3.toString());

		IntegerSet testSet5 = new IntegerSet();
		IntegerSet testSet6 = new IntegerSet();
		testSet6.add(10);
		testSet6.add(20);
		testSet6.add(25);
		testSet6.add(30);

		testSet5.intersect(testSet6);
		assertEquals("[]", testSet5.toString());

		IntegerSet testSet7 = new IntegerSet();
		IntegerSet testSet8 = new IntegerSet();
		testSet7.intersect(testSet8);
		assertEquals("[]", testSet7.toString());
	}

	@Test
	@DisplayName("Test cases for union method")
	void testUnion() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);

		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(10);
		testSet2.add(15);
		testSet2.add(20);
		testSet2.add(25);
		testSet2.add(30);

		testSet1.union(testSet2);
		assertEquals("[10, 35, 40, 45, 50, 15, 20, 25, 30]", testSet1.toString());

		IntegerSet testSet3 = new IntegerSet();
		testSet3.add(10);
		testSet3.add(35);
		testSet3.add(40);
		testSet3.add(45);
		testSet3.add(50);

		IntegerSet testSet4 = new IntegerSet();
		testSet3.union(testSet4);
		assertEquals("[10, 35, 40, 45, 50]", testSet3.toString());

		IntegerSet testSet5 = new IntegerSet();
		IntegerSet testSet6 = new IntegerSet();
		testSet6.add(10);
		testSet6.add(20);
		testSet6.add(25);
		testSet6.add(30);

		testSet5.union(testSet6);
		assertEquals("[10, 20, 25, 30]", testSet5.toString());

		IntegerSet testSet7 = new IntegerSet();
		IntegerSet testSet8 = new IntegerSet();
		testSet7.union(testSet8);
		assertEquals("[]", testSet7.toString());
	}

	@Test
	@DisplayName("Test cases for equals method")
	void testEquals() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(10);
		testSet2.add(20);
		testSet2.add(25);
		testSet2.add(30);

		boolean expectedBoolean = testSet1.equals(testSet2);
		assertEquals(true, expectedBoolean);

		testSet1.add(10);
		testSet1.add(20);
		testSet1.add(25);
		testSet1.add(30);

		testSet2.add(15);
		testSet2.add(20);
		testSet2.add(25);
		testSet2.add(30);

		expectedBoolean = testSet1.equals(testSet2);
		assertEquals(false, expectedBoolean);

		testSet1.clear();
		testSet2.clear();
		expectedBoolean = testSet1.equals(testSet2);
		assertEquals(true, expectedBoolean);
	}

	@Test
    @DisplayName("Test cases for largest method")
    void testLargest() {

        IntegerSet testSet1 = new IntegerSet();
        testSet1.add(10);
        testSet1.add(35);
        testSet1.add(40);
        testSet1.add(45);
        testSet1.add(50);

        try {
            assertDoesNotThrow(() - > testSet1.largest());
            assertEquals(50, testSet1.largest());
        } catch (Exception e) {
            fail("Exception thrown when not supposed to");
        }

        IntegerSet testSet2 = new IntegerSet();
        assertThrows(IntegerSetException.class, () - > testSet2.largest());
    }

	@Test
    @DisplayName("Test cases for largest method to check if appropriate exception is thrown")
    void testLargestException() {

        IntegerSet testSet1 = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () - > testSet1.largest());
        assertEquals("IntegerSetException: Set is Empty", exception.getMessage());
    }

	@Test
    @DisplayName("Test cases for smallest method")
    void testSmallest() {

        IntegerSet testSet1 = new IntegerSet();
        testSet1.add(10);
        testSet1.add(35);
        testSet1.add(40);
        testSet1.add(45);
        testSet1.add(50);

        try {
            assertDoesNotThrow(() - > testSet1.smallest());
            assertEquals(10, testSet1.smallest());
        } catch (Exception e) {
            fail("Exception thrown when not supposed to");
        }

        IntegerSet testSet2 = new IntegerSet();
        assertThrows(IntegerSetException.class, () - > testSet2.smallest());
    }

	@Test
    @DisplayName("Test cases for smallest method to check if appropriate exception is thrown")
    void testSmallestException() {

        IntegerSet testSet1 = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () - > testSet1.smallest());
        assertEquals("IntegerSetException: Set is Empty", exception.getMessage());
    }

	@Test
	@DisplayName("Test cases for contains method")
	void testContains() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);

		assertEquals(true, testSet1.contains(50));
		assertEquals(false, testSet1.contains(77));

		testSet1.clear();
		assertEquals(false, testSet1.contains(77));
	}

	@Test
	@DisplayName("Test cases for isEmpty method")
	void testIsEmpty() {

		IntegerSet testSet1 = new IntegerSet();
		assertEquals(true, testSet1.isEmpty());

		testSet1.add(10);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);
		assertEquals(false, testSet1.isEmpty());
	}

	@Test
	@DisplayName("Test cases for getSet method")
	void testGetSet() {

		IntegerSet testSet1 = new IntegerSet();
		testSet1.add(10);
		testSet1.add(35);
		testSet1.add(40);
		testSet1.add(45);
		testSet1.add(50);

		List<Integer> expectedSet = Arrays.asList(10, 35, 40, 45, 50);
		assertEquals(expectedSet.toString(), testSet1.toString());

		testSet1.clear();
		expectedSet = Arrays.asList();
		assertEquals(expectedSet.toString(), testSet1.toString());
	}
}