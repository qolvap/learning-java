import java.util.Scanner; // Importing the Scanner class from the java.util package for user input.

public class Main {
    final static int PASSWORD = 1234; // Declaring a final static integer variable PASSWORD and initializing it with the value 1234.
  //final static int means the variable is a constant integer value that belongs to the class and cannot be changed after it's initialized

    public static void main(String[] args) { // Main method, the entry point of the program.
        Scanner scanner = new Scanner(System.in); // Creating a new Scanner object to read input from the console.
        int inputNumber = scanner.nextInt(); // Reading an integer input from the user and storing it in the variable inputNumber.

        if (inputNumber == PASSWORD) { // Checking if the inputNumber matches the PASSWORD.
            System.out.println("Hello, User"); // If the inputNumber matches the PASSWORD, printing "Hello, User".
        } else {
            System.out.println("Access denied"); // If the inputNumber does not match the PASSWORD, printing "Access denied".
        }
      scanner.close(); // Closing the Scanner object to avoid the resource leak.
    }
}

