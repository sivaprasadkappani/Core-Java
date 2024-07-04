package com.igniquest.corejava.io;

import java.util.Scanner;

public class UserFileCreator {
	public static void main(String[] args) {
        TextFileHandler handler = new TextFileHandler("D:\\Temp\\Java Training\\Files\\UserFile.txt");
        
        handler.createFile();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text lines. Enter 'exit' to stop:");

        String line;
        while ( true ) {
        	if( !(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
               handler.appendLine(line);
        	}
        	else {
        	  break;
        	}  
        }
        System.out.println("Program End.");
        
        scanner.close();
    }
}
