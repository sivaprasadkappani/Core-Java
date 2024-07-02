package com.igniquest.corejava.using.object;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPrecisionExample {

    public static void main(String[] args) {
        // Create a BigDecimal object with an initial value
        BigDecimal originalValue = new BigDecimal("123.456789");

        // Set the scale to 3 digits after the decimal point
        BigDecimal roundedValue = originalValue.setScale(3, RoundingMode.HALF_UP);

        // Display the original and rounded values
        System.out.println("Original Value: " + originalValue);
        System.out.println("Rounded Value: " + roundedValue);
    }
}
