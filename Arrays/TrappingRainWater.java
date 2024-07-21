import java.io.*;
public class TrappingRainWater {
    // Method-1: Brute Force Approach
    /*
    static int maxWater(int[] arr, int n) {
        int res = 0;

        // Traverse every element of the array except the first and last element
        for (int i = 1; i < n - 1; i++) {
            // Find maximum element on the left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on the right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            // Update the total water trapped
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
    */

    // Method-2: Efficient Approach with Pre-calculation
    static int findWater(int[] arr, int n) {
        // Arrays to store the maximum height to the left and right of each bar
        int[] left = new int[n];
        int[] right = new int[n];

        int water = 0;

        // Fill the left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // Fill the right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // Calculate the accumulated water element by element
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;

        // Using Method-2 (Efficient Approach)
        System.out.println("Trapping Rain Water using Efficient Approach:");
        System.out.println("Water trapped: " + findWater(arr, n));

        // Complexity Analysis
        /*
        System.out.println("\nFor Brute Force Method:");
        System.out.println("Time Complexity: O(N^2)");
        System.out.println("Auxiliary Space: O(1)");

        System.out.println("\nFor Efficient Method:");
        System.out.println("Time Complexity: O(N)");
        System.out.println("Auxiliary Space: O(N)");
        */
    }
}
