package com.igniquest.corejava.exception;

public class ConvreterWithCustomExcpetionTest {
	public static void main(String[] args) {
		
		ConverterWithCustomException cce = new ConverterWithCustomException();
        try {
            System.out.println(cce.convertDay(1));  // Should print "Sunday"
            System.out.println(cce.convertDay(7));  // Should print "Saturday"
            // Invalid day number, should throw InvalidDayRangeException
            System.out.println(cce.convertDay(8));
        } catch (InvalidDayRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println(cce.convertMonth(1));  // Should print "January"
            System.out.println(cce.convertMonth(12)); // Should print "December"
            // Invalid month number, should throw InvalidMonthRangeException
            System.out.println(cce.convertMonth(13));
        } catch (InvalidMonthRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
