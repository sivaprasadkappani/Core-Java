package com.igniquest.corejava.collections.list;

import java.util.ArrayList;

public class ArrayListSortExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        // Display the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList using ArrayList.sort() method
        numbers.sort(null); // sorts in natural order (ascending for integers)

        // Display the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}
