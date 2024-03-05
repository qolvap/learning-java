import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name");

        // Read the user's name input
        String name = s.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age");

        // Calculate the user's age by subtracting the input from the current year
        int age =  s.nextInt();

        // Display a greeting message including the user's name and calculated age
        System.out.println("Hello " + name + "! Your age is " + age + ".");
    }
}
