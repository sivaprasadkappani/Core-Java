package com.igniquest.corejava.exception;


public class DayMonthConverter {

    public static String convertDay(int day) {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default:
                throw new IllegalArgumentException("Invalid day number. Must be between 1 and 7.");
        }
    }

    public static String convertMonth(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:
                throw new IllegalArgumentException("Invalid month number. Must be between 1 and 12.");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(convertDay(1));  // Should print "Sunday"
            System.out.println(convertDay(7));  // Should print "Saturday"
            // Invalid day number, should throw IllegalArgumentException
            System.out.println(convertDay(8));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println(convertMonth(1));  // Should print "January"
            System.out.println(convertMonth(12)); // Should print "December"
            // Invalid month number, should throw IllegalArgumentException
            System.out.println(convertMonth(13));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
