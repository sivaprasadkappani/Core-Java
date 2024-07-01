package com.igniquest.corejava.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class NoWildcardExample {

    public static void main(String[] args) {
        // Create a list of numbers
        List<Number> numbers = new ArrayList<>();
        
        // Will not be able to add if decalration is below
        // List<? extends Number> numbers = new ArrayList<>();
        
        // Adding elements of type Number or its subtypes
        numbers.add( 4 ); // Integer (subtype of Number)
        numbers.add(2.5); // Double (subtype of Number)
        
        // Valid: Can retrieve elements as Number
        Number firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);
        
        // Print all elements
        System.out.print("Elements in numbers list: ");
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
    }
}
