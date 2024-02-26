import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner fromUser = new Scanner(System.in);

      int num1, num2, res;

      System.out.println("Enter the first number: ");
      num1 = fromUser.nextInt();

      System.out.println("Enter the second number: ");
      num2 = fromUser.nextInt();

      res = num1 + num2;
      System.out.print(num1 + " + " + num2 + " = " + res);

    }
}
