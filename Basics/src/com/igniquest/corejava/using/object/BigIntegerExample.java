package com.igniquest.corejava.using.object;

import java.math.BigInteger;

public class BigIntegerExample {

    public static void main(String[] args) {
        // Initialize BigInteger objects
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        // Perform arithmetic operations
        BigInteger sum = num1.add(num2);
        BigInteger difference = num1.subtract(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger quotient = num2.divide(num1);

        // Display results
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
