package com.igniquest.corejava.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterationExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Iterate through the ArrayList using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Current number: " + number);
        }
    }
}
