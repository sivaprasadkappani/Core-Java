package com.igniquest.corejava.using.object;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        // Creating a Date object with the current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Creating a Date object with a specific timestamp (milliseconds since epoch)
        long timestamp = 1624636800000L; // Example timestamp representing July 25, 2021, 00:00:00 GMT
        Date specificDate = new Date(timestamp);
        System.out.println("Specific Date: " + specificDate);

        // Performing operations with Date
        System.out.println("Current Date before specificDate? " + currentDate.before(specificDate));
        System.out.println("Current Date after specificDate? " + currentDate.after(specificDate));

        // Setting Date using setTime() method
        currentDate.setTime(timestamp);
        System.out.println("Current Date set to specificDate: " + currentDate);
    }
}
