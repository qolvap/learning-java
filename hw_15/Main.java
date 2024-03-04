import java.util.Arrays;

public class Main {

    public static void Main(String[] args) {
        // Sample array of integers
        int[] array = new int[]{3, 5, 8, 13, 21, 34, 55, 89};

        // Print the result of the getSumCheckArray method
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
 public static boolean[] getSumCheckArray(int[] array){
        // Initialize the result array with the same length as the input array
        boolean[] result = new boolean[array.length];

        // First two elements are always false
        result[0] = false;
        result[1] = false;

        // Iterate through the array starting from the third element
        for (int i = 2; i < array.length; i++) {
            // Check if the current element is equal to the sum of the two previous elements
            if (array[i] == array[i-1] + array[i-2]) {
                // If the condition is true, set the corresponding element in the result array to true
                result[i] = true;
            } else {
                // If the condition is false, set the corresponding element in the result array to false
                result[i] = false;
            }
        }

        // Return the resulting array
        return result;
    }
}
