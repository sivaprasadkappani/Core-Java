package com.igniquest.corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        // Adding elements
        set1.add("apple");
        set1.add("banana");
        set1.add("apple"); // Duplicate element

        // Printing elements
        System.out.println("HashSet contains: " + set1);
        
        
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // Adding elements (including duplicates)
        set2.add("apple");
        set2.add("banana");
        set2.add("apple"); // Duplicate entry

        // Printing elements
        System.out.println("LinkedHashSet contains: " + set2);
    }
}