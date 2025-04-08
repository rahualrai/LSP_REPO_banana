package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;

/**
 * The IntegerSet class represents a set of integers and provides methods to perform
 * various operations like union, intersection, difference, and more.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    /**
     * Default constructor to create an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Constructor to create a set with an already initialized list of integers.
     *
     * @param set the list of integers to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal. Two sets are equal if they contain the same elements,
     * regardless of the order.
     *
     * @param o the object to compare with
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet other = (IntegerSet) o;
        if (this.length() != other.length()) {
            return false;
        }
        for (Integer item : this.set) {
            if (!other.contains(item)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the set contains a specific value.
     *
     * @param value the value to check
     * @return true if the value is in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest value in the set.
     *
     * @return the largest value
     * @throws IllegalArgumentException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set is empty");
        }
        int max = set.get(0);
        for (int val : set) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    /**
     * Returns the smallest value in the set.
     *
     * @return the smallest value
     * @throws IllegalArgumentException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set is empty");
        }
        int min = set.get(0);
        for (int val : set) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    /**
     * Adds a value to the set. If the value is already in the set, it does nothing.
     *
     * @param item the value to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes a value from the set. If the value is not in the set, it does nothing.
     *
     * @param item the value to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set. The result is stored in this set.
     *
     * @param intSetb the other set to union with
     */
    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            if (!this.contains(item)) {
                this.set.add(item);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set. The result is stored in this set.
     *
     * @param intSetb the other set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (Integer item : this.set) {
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        this.set = intersection;
    }

    /**
     * Performs the difference of this set with another set (this set - other set).
     * The result is stored in this set.
     *
     * @param intSetb the other set to subtract
     */
    public void diff(IntegerSet intSetb) {
        List<Integer> difference = new ArrayList<>();
        for (Integer item : this.set) {
            if (!intSetb.contains(item)) {
                difference.add(item);
            }
        }
        this.set = difference;
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return the string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}