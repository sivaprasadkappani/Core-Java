package com.igniquest.corejava.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperWildcardExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
         
        // Assigning List<Integer> to List<? extends Number>
        List<? extends Number> numbers = integers;
        
        // This one does not complile
        //integers.add(12.5);
        
        // Valid: Can retrieve elements as Number
        Number firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);
        
        // Invalid: Cannot add elements (except null)
        // numbers.add(3); // Compile-time error
        
        // However, you can add null
        // numbers.add(null); // Valid: null is allowed
        
        // Print all elements
        System.out.print("Elements in numbers list: ");
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
    }
}
