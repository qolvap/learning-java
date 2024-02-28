import java.util.Arrays;

public class ArrayMethods {

    // Converts the specified array into a string representation.
    public static String toString(<type>[] a) {
        return Arrays.toString(a);
    }

    // Copies the specified array, truncating or padding with nulls (if necessary)
    // so the copy has the specified length.
    public static <type>[] copyOf(<type>[] original, int newLength) {
        return Arrays.copyOf(original, newLength);
    }

    // Returns true if the two specified arrays are equal to one another.
    public static boolean equals(<type>[] a, <type>[] a2) {
        return Arrays.equals(a, a2);
    }

    // Sorts the specified array into ascending numerical order.
    public static void sort(<type>[] a) {
        Arrays.sort(a);
    }

    // Searches the specified array for the specified value using the binary search algorithm.
    public static int binarySearch(<type>[] arr, <type> key) {
        return Arrays.binarySearch(arr, key);
    }

    // Assigns the specified value to each element of the specified array.
    public static void fill(<type>[] arr, <type> value) {
        Arrays.fill(arr, value);
    }

    public static void main(String[] args) {
        // Example for toString method
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(array)); 
        // Output: [9, 8, 7, 6, 5]

        // Example for copyOf method
        int[] newArray = Arrays.copyOf(array, 8);  
        System.out.println(Arrays.toString(newArray));
        // Output: [9, 8, 7, 6, 5, 0, 0, 0]

        // Example for equals method
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr3)); // false

        // Example for sort method
        int intArr[] = {55, 57, 61, 66, 18, 19, 27, 38, 10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));
        // Output: The sorted int array is: [10, 15, 18, 18, 19, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95]

        // Example for binarySearch method
        int searchVal = 55;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element 55 is : " + retVal);
        // Output: The index of element 55 is : 9

        // Example for fill method
        int[] arrayFill = new int[7];
        Arrays.fill(arrayFill, -1);
        System.out.println(Arrays.toString(arrayFill));
        // Output: [-1, -1, -1, -1, -1, -1, -1]
    }
}
