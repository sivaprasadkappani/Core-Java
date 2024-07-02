package com.igniquest.corejava.using.object;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        System.out.print("Enter your name: ");
        String name = scanner.next(); // Reads a single word

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble(); // Reads a double

        // Displaying inputs
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is $" + salary);

        // Closing the scanner
        scanner.close();
    }
}
