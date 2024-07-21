import java.util.*;
public class CircularSubarrayMaxSum {
    // Method-1: Naive Approach
    /*
    static int maxCircularSum(int arr[], int n) {
        int res = arr[0]; // Initialize result to the first element

        // Iterate through each possible starting point of the subarray
        for (int i = 0; i < n; i++) {
            int curr_max = arr[i]; // Initialize current max and sum for this starting point
            int curr_sum = arr[i];

            // Calculate the sum of subarrays starting from index i
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n; // Compute the circular index
                curr_sum += arr[index]; // Add the element to current sum
                curr_max = Math.max(curr_max, curr_sum); // Update current max sum
            }

            // Update the result with the maximum sum found
            res = Math.max(res, curr_max);
        }
        return res;
    }
    */

    // Method-2: Efficient Approach
    static int normalMaxSum(int arr[], int n) {
        int res = arr[0]; // Initialize result to the first element
        int maxEnding = arr[0]; // Initialize max sum ending at the current position

        // Iterate through the array to find the maximum subarray sum using Kadane's algorithm
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]); // Update max sum ending at position i
            res = Math.max(res, maxEnding); // Update the global maximum subarray sum
        }

        return res;
    }

    static int overallMaxSum(int arr[], int n) {
        // Find the maximum subarray sum without considering circularity
        int max_normal = normalMaxSum(arr, n);

        // If all elements are negative, return the maximum of the normal sum
        if (max_normal < 0) return max_normal;

        // Compute the total sum of the array
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i]; // Invert the array elements
        }

        // Find the maximum subarray sum of the inverted array
        int max_circular = arr_sum + normalMaxSum(arr, n);

        // Return the maximum of the normal sum and circular sum
        return Math.max(max_circular, max_normal);
    }

    public static void main(String[] args) {
        // Given array arr[]
        int arr[] = {8, -4, 3, -5, 4};
        int n = arr.length;

        // Using Method-2 (Efficient Approach)
        System.out.println("Maximum subarray sum in a circular array: " + overallMaxSum(arr, n));

        // Uncomment the following lines to use Method-1 (Naive Approach)
        /*
        int arrNaive[] = {5, -2, 3, 4};
        int nNaive = arrNaive.length;
        System.out.println("Maximum subarray sum in a circular array (Naive Approach): " + maxCircularSum(arrNaive, nNaive));
        */

        System.out.println("For Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
