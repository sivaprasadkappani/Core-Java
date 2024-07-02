package com.igniquest.corejava.using.object;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        
        // Using default delimiter (whitespace)
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
        
        // Using custom delimiter (comma and space)
        String names = "John, Jane, Jim, Joe";
        StringTokenizer namesTokenizer = new StringTokenizer(names, ", ");
        
        while (namesTokenizer.hasMoreTokens()) {
            String name = namesTokenizer.nextToken();
            System.out.println("Name: " + name);
        }
    }
}
