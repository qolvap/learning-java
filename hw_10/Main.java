import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Prompt the user to enter the length of the array
        System.out.print("Enter number of array length: ");

        // Create a new Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Read the number of elements entered by the user
        int user_nums = scan.nextInt();

        // Create an array to store the user input numbers
        short[] nums = new short[user_nums];

        // Iterate over the array length to get user input for each element
        for(int i=0; i<user_nums; i++) {
            // Prompt the user to enter the value for each element
            System.out.print("Enter element " + (i + 1) + ": ");
            // Read the short value entered by the user and store it in the array
            nums[i] = scan.nextShort();
        }

        // Initialize a variable to store the maximum value entered by the user
        short max_user_nums = nums[0];

        // Iterate over the array to find the maximum value entered by the user
        for(int i=0; i<user_nums; i++) {
            // Check if the current element is greater than the current maximum value
            if(nums[i] > max_user_nums){
                // If so, update the maximum value
                max_user_nums = nums[i];
            }
        }

        // Print the maximum value entered by the user
        System.out.println("Max element is: " + max_user_nums);

        // Print all the elements entered by the user
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
