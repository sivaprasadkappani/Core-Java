package com.igniquest.corejava.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Adding elements
        stack.push("apple");
      
        stack.push("apple"); // Attempting to add duplicate
        
        stack.push("banana");

        // Printing elements
        System.out.println("Stack contains: " + stack);
    }
}
