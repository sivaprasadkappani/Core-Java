package com.igniquest.corejava.collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(2);						
        treeSet.add(8);
        treeSet.add(1);

        // Elements are automatically sorted
        System.out.println("Sorted TreeSet: " + treeSet);

        // NavigableSet operations
        System.out.println("Ceiling for 3: " + treeSet.ceiling(3)); // Returns 5 (next higher or equal element)
        System.out.println("Floor for 6: " + treeSet.floor(6));     // Returns 5 (next lower or equal element)
    }
}
