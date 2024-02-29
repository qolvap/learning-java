import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input values from the console

        long[] values = new long[100]; // Array to store the input values. Array size is set to 100.
        int count = 0; // Counter for the number of input values

        System.out.println("Enter values (enter 0 to finish):"); // Prompting the user to enter values

        // Reading input values and storing them in the array
        long value = scanner.nextLong(); // Reading the first input value
        while (value != 0) { // Loop until the input value is not equal to 0
            values[count] = value; // Storing the input value in the array
            count++; // Incrementing the counter for the number of input values
            value = scanner.nextLong(); // Reading the next input value
        }

        // Calculating the sum of all input values
        long sum = 0; // Variable to store the sum
        for (int i = 0; i < count; i++) { // Loop to iterate over all elements in the array with input values
            sum += values[i]; // Adding the value to the total sum
        }

        // Printing the sum to the console
        System.out.println("Sum of values: " + sum); // Printing the sum of all input values
    }
}
