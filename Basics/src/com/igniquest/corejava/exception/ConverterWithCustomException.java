package com.igniquest.corejava.exception;


public class ConverterWithCustomException {

    public  String convertDay(int day) throws InvalidDayRangeException {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default:
                throw new InvalidDayRangeException("Invalid day number. Must be between 1 and 7.");
        }
    }

    public  String convertMonth(int month) throws InvalidMonthRangeException {
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
                throw new InvalidMonthRangeException("Invalid month number. Must be between 1 and 12.");
        }
    }

    
}
