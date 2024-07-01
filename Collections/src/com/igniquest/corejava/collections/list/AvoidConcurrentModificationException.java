package com.igniquest.corejava.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class AvoidConcurrentModificationException {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Iterator to traverse the ArrayList
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Current number: " + number);

            // Use iterator's remove method to safely remove elements
            if (number % 2 == 0) {
                iterator.remove(); // Removes the current element from the ArrayList
            }
        }

        // Display the modified ArrayList after removal
        System.out.println("Modified ArrayList: " + numbers);
    }
}
