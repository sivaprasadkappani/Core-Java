package com.igniquest.corejava.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {

    public static void main(String[] args) {
        // Create a list of Objects
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(42);
        
        // Assigning List<Object> to List<? super Number>
        List<? super Number> numbers = objects;
        
        // Valid: Can add elements of type Number or its subtypes
        numbers.add(3); // Integer (subtype of Number)
        numbers.add(4.5); // Double (subtype of Number)
        
        // Invalid: Cannot retrieve elements as Number directly
        // Number firstElement = numbers.get(0); // Compile-time error
        
        // Print all elements
        System.out.print("Elements in numbers list: ");
        for (Object obj : numbers) {
            System.out.print(obj + " ");
        }
    }
}
