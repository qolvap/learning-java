// MaxMethod.java
public class MaxMethod {
    // This method finds the maximum value in the input integer array.
    public static int max(int[] values) {
        // Check if the input array is null or empty
        if (values == null || values.length == 0) {
            // Throw an exception if the input array is null or empty
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        // Initialize the maximum value to the first element of the array
        int maxVal = values[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < values.length; i++) {
            // Update maxVal if the current element is greater than maxVal
            if (values[i] > maxVal) {
                maxVal = values[i];
            }
        }

        // Return the maximum value found in the array
        return maxVal;
    }
}
