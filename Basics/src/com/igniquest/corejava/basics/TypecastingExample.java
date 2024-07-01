package com.igniquest.corejava.basics;

public class TypecastingExample {
    public static void main(String[] args) {
        // Widening (implicit) typecasting - no loss of data
        int intValue = 100;
        long longValue = intValue; // int to long

        System.out.println("Widening Typecasting:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);

        // Narrowing (explicit) typecasting - potential loss of data
        double doubleValue = 123.45;
        int intValue2 = (int) doubleValue; // double to int

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double value: " + doubleValue);
        System.out.println("int value (after typecasting): " + intValue2);
    }
}
