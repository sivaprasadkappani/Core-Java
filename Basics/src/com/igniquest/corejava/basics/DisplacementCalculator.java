package com.igniquest.corejava.basics;

import java.util.Scanner;

public class DisplacementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the initial velocity (u): ");
        double u = scanner.nextDouble();

        System.out.print("Enter the final velocity (v): ");
        double v = scanner.nextDouble();

        System.out.print("Enter the acceleration (a): ");
        double a = scanner.nextDouble();

        // Calculate displacement using the formula s = (v^2 - u^2) / (2 * a)
        double vSquared = v * v;
        double uSquared = u * u;
        double s = (vSquared - uSquared) / (2 * a);

        // Display the calculated displacement
        System.out.println("The displacement (s) is: " + s + " units");

        scanner.close();
    }
}
