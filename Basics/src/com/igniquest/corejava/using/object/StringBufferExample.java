package com.igniquest.corejava.using.object;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer content: " + buffer);

        // Append additional characters
        buffer.append(" World!");
        System.out.println("After appending: " + buffer);

        // Insert characters at a specific position
        buffer.insert(5, ", Java");
        System.out.println("After insertion: " + buffer);

        // Replace characters
        buffer.replace(6, 10, "Universe");
        System.out.println("After replacement: " + buffer);

        // Delete characters
        buffer.delete(12, 16);
        System.out.println("After deletion: " + buffer);

        // Reverse the content
        buffer.reverse();
        System.out.println("After reversing: " + buffer);
    }
}
