package com.igniquest.corejava.using.object;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        // Creating a Random object
        Random random = new Random();

        // Generating random integers
        int randomNumber1 = random.nextInt(); // Generates a random integer
        System.out.println("Random Integer 1: " + randomNumber1);

        int randomNumber2 = random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random Integer 2: " + randomNumber2);

        // Generating random doubles
        double randomDouble1 = random.nextDouble(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random Double 1: " + randomDouble1);

        // Generating random booleans
        boolean randomBoolean = random.nextBoolean(); // Generates a random boolean value (true or false)
        System.out.println("Random Boolean: " + randomBoolean);
    }
}
