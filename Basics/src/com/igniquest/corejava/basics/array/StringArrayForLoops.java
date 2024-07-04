package com.igniquest.corejava.basics.array;

public class StringArrayForLoops {

    public static void main(String[] args) {
        // Initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        // Using traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Using enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop (for-each loop):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
