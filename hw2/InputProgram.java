// This program demonstrates console input and output, exception handling, and data type conversion.

import java.io.IOException; // Importing the library for exception handling

public class Main { // Declaring a class named Main
    public static void main(String[] args) { // Main method of the program
        int x ; // Declaring a variable x to store the input character

        try { // Starting a try block to handle exceptions
            x = System.in.read(); // Waiting for user input from the console and storing it in variable x
            System.out.println("code =" + x + " x=" + (char)x ); // Printing the input character and its ASCII code to the console
        } catch (IOException e) { // Catching IOException (input/output error) exception
            e.printStackTrace(); // Printing details of the error to the console
        }
    }
}
// Console output: code = 55 x=7
