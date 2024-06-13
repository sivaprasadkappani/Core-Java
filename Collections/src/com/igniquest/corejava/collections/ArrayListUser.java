package com.igniquest.corejava.collections;

import java.util.ArrayList;

public class ArrayListUser {
	public static void main(String[] args) {
        // Create a raw ArrayList (no generics)
        ArrayList items = new ArrayList();

        // Add different types of items to the ArrayList
        items.add("Hello, World!"); // String
        items.add(123);             // Integer
        items.add(45.67);           // Double
        items.add(true);            // Boolean

        // Print all items in the ArrayList
        System.out.println("All Items in the ArrayList:");
        for (Object item : items) {
            System.out.println(item);
        }

        // Access and print specific items by index
        System.out.println("Item at index 0: " + items.get(0)); // "Hello, World!"
        System.out.println("Item at index 2: " + items.get(2)); // 45.67

        // Print the size of the ArrayList
        System.out.println("Size of the ArrayList: " + items.size());
    }
}
