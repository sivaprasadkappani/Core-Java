package com.igniquest.corejava.using.object;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder content: " + builder);

        // Append additional characters
        builder.append(" World!");
        System.out.println("After appending: " + builder);

        // Insert characters at a specific position
        builder.insert(5, ", Java");
        System.out.println("After insertion: " + builder);

        // Replace characters
        builder.replace(6, 10, "Universe");
        System.out.println("After replacement: " + builder);

        // Delete characters
        builder.delete(12, 16);
        System.out.println("After deletion: " + builder);

        // Reverse the content
        builder.reverse();
        System.out.println("After reversing: " + builder);
    }
}
