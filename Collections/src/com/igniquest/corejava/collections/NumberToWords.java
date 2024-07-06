package com.igniquest.corejava.collections;

public class NumberToWords {
    
    // Arrays to store words for numbers
    private final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
        "Seventeen", "Eighteen", "Nineteen"
    };

    private final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private final String hundred = "Hundred";
    private final String thousand = "Thousand";

    // Method to convert number to words
    public String convert(int number) {
        if (number < 0 || number > 1000) {
            throw new IllegalArgumentException("Number out of range (1 to 1000)");
        }

        if (number == 0) {
            return "Zero";
        }

        if (number == 1000) {
            return "One Thousand";
        }

        return convertNumberToWords(number);
    }

    // Private method to handle the conversion logic
    private String convertNumberToWords(int number) {
        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            int hundreds = number / 100;
            words.append(units[hundreds]).append(" ").append(hundred);
            number %= 100;

            if (number > 0) {
                words.append(" and ");
            }
        }

        if (number >= 20) {
            int tenPart = number / 10;
            words.append(tens[tenPart]);
            number %= 10;

            if (number > 0) {
                words.append(" ").append(units[number]);
            }
        } else if (number > 0) {
            words.append(units[number]);
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        // Create an instance of NumberToWords class
        NumberToWords converter = new NumberToWords();

        // Test cases
        int[] testNumbers = {1, 15, 50, 99, 123, 456, 789, 999, 1000};

        for (int number : testNumbers) {
            System.out.println(number + " in words is: " + converter.convert(number));
        }
    }
}
