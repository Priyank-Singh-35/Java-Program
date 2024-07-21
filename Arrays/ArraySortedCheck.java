import java.io.*;
public class ArraySortedCheck {

    // Method-1: Naive Approach to check if the array is sorted
    /*
    static boolean isSortedNaive(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    */

    // Method-2: Iterative Approach to check if the array is sorted
    static boolean arraySortedOrNot(int arr[], int n) {
        // Array has one or no element, considered sorted
        if (n == 0 || n == 1) {
            return true;
        }

        // Iterate through the array to check if every element is in non-decreasing order
        for (int i = 1; i < n; i++) {
            // Unsorted pair found
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        // No unsorted pair found, array is sorted
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {20, 23, 23, 45, 78, 88}; // Example array
        int n = arr.length; // Array length

        // Check if the array is sorted using Iterative Approach
        if (arraySortedOrNot(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Uncomment below lines to use the Naive Approach
        /*
        if (isSortedNaive(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        */

        System.out.println("\nFor Naive Approach:\nTime Complexity: O(n^2)\nAuxiliary Space: O(1)");
        System.out.println("For Iterative Approach:\nTime Complexity: O(n)\nAuxiliary Space: O(1)");
    }
}
