package com.igniquest.corejava.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements (including duplicates)
        list.add("apple");
        
        list.add("apple"); // Duplicate entry
        
        list.add("banana");
        
        

        // Printing elements
        System.out.println("LinkedList contains: " + list);
    }
}
