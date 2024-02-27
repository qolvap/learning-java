import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // Creating a Scanner object to read input from the user
      Scanner fromUser = new Scanner(System.in);

      // Declaring variables to store the input numbers and the result of the operation
      double num1, num2, res;

      // Declaring a variable to store the operation to be performed
      String dos;

      // Prompting the user to enter the first number
      System.out.println("Enter the first number: ");

      // Reading the first number entered by the user and converting it to double
      num1 = Double.parseDouble(fromUser.nextLine());

      // Prompting the user to enter the second number
      System.out.println("Enter the second number: ");

      // Reading the second number entered by the user and converting it to double
      num2 = Double.parseDouble(fromUser.nextLine());

      // Prompting the user to enter the operation to be performed
      System.out.println("What to do (+,-,*,/)? ");

      // Reading the operation entered by the user
      dos = fromUser.nextLine();

      // Checking if the operation is division and the second number is 0
      if (dos.equals("/") && num2 == 0){
        // Printing an error message if the user attempts to divide by zero
        System.out.print("Ups...can not do that");
        return; // Exiting the program
      } else if (dos.equals("+")){
        // Performing addition if the operation is addition
        res = num1 + num2;
        // Printing the result of the addition operation
        System.out.print(num1 + " + " + num2 + " = " + res);
      } else if (dos.equals("-")){
        // Performing subtraction if the operation is subtraction
        res = num1 - num2;
        // Printing the result of the subtraction operation
        System.out.print(num1 + " - " + num2 + " = " + res);
      } else if (dos.equals("/")){
        // Performing division if the operation is division
        res = num1 / num2;
        // Printing the result of the division operation
        System.out.print(num1 + " / " + num2 + " = " + res);
      } else if (dos.equals("*")){
        // Performing multiplication if the operation is multiplication
        res = num1 * num2;
        // Printing the result of the multiplication operation
        System.out.print(num1 + " * " + num2 + " = " + res);
      } else { 
        // Handling the case when the operation entered by the user is invalid
        res = 0; 
        // Printing an error message
        System.out.print("Error");
      };
    }
}
