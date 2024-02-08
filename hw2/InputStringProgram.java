// This example demonstrates how to read a word from the console using the Scanner class and then print it out.
// The purpose of this example is to show how to take input from the user and display it back to them.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a word
        System.out.print("Enter a word: ");

        // Reading a word entered by the user
        String input = scanner.next();

        // Printing out the input entered by the user with a greeting message
        System.out.println("Hello " + input);
    }
}
// The console will output "Hello dog" after the user enters the word "dog".
