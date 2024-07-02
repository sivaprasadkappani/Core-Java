package com.igniquest.corejava.using.object;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {
        // Creating BigDecimal objects
        BigDecimal num1 = new BigDecimal("123.456"); // Using String constructor for precision
        BigDecimal num2 = new BigDecimal("789.012");

        // Performing basic arithmetic operations
        BigDecimal sum = num1.add(num2); // Addition
        BigDecimal difference = num1.subtract(num2); // Subtraction
        BigDecimal product = num1.multiply(num2); // Multiplication
        BigDecimal quotient = num1.divide(num2); // Division (integer division)

        // Displaying results
        System.out.println("BigDecimal num1: " + num1);
        System.out.println("BigDecimal num2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
