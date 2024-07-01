package com.igniquest.corejava.collections.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList using add() method
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Display the ArrayList
        System.out.println("ArrayList after adding elements: " + arrayList);

        // Add an element at a specific index using add(index, element) method
        arrayList.add(2, "Mango");

        // Display the ArrayList after adding at index
        System.out.println("ArrayList after adding at index 2: " + arrayList);

        // Remove an element from the ArrayList using remove() method
        arrayList.remove("Banana");

        // Display the ArrayList after removing an element
        System.out.println("ArrayList after removing 'Banana': " + arrayList);

        // Check whether ArrayList contains a particular element using contains() method
        String searchElement = "Orange";
        if (arrayList.contains(searchElement)) {
            System.out.println("ArrayList contains '" + searchElement + "'");
        } else {
            System.out.println("ArrayList does not contain '" + searchElement + "'");
        }
    }
}
