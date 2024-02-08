// This program is designed to read a number from the console and print it out.

// We import the Scanner class from the java.util package to be able to read user input from the console.
import java.util.Scanner;

// We define the Main class, which will contain our main method.
public class Main {
    // The main method of the program, where all the code of the program is executed.
    public static void main(String[] args) {
        // We create an object of the Scanner class to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // We declare a variable named number of type int, where we will store the read number.
        int number = scanner.nextInt(); // We call the nextInt() method to read an integer from the console.

        // We print the read number to the console.
        System.out.println(number);
    }
}
/* This code uses the Scanner class to read an integer from the console. 
*The nextInt() method of the Scanner class is used to read the next integer from the user input. 
*The entered number is then printed to the console using the println() method of the System.out class. 
*It's important to note that the nextInt() method expects the user to input an integer and does not accept symbols or letters. 
*The console will output "1111" when the user inputs it but does not accept anything other than integers.
*/
