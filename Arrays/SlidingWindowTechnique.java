import java.io.*;
public class SlidingWindowTechnique {
    // Method-1: Naive Approach
    /*
    static int maxSumNaive(int arr[], int n, int k) {
        if (k > n) {
            System.out.println("Invalid");
            return -1; // Return -1 to indicate invalid case
        }

        int max_sum = Integer.MIN_VALUE;

        // Traverse each block of k elements
        for (int i = 0; i + k - 1 < n; i++) {
            int sum = 0;

            // Calculate sum of current block
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }

            // Update maximum sum
            max_sum = Math.max(max_sum, sum);
        }

        return max_sum;
    }
    */

    // Method-2: Efficient Approach (Sliding Window Technique)
    static int maxSum(int arr[], int n, int k) {
        if (k > n) {
            System.out.println("Invalid");
            return -1; // Return -1 to indicate invalid case
        }

        int curr_sum = 0;

        // Compute sum of the first window of k elements
        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;

        // Slide the window over the array
        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        // Test cases
        int arr1[] = {100, 200, 300, 400};
        int k1 = 2;
        System.out.println("Maximum sum of " + k1 + " consecutive elements: " + maxSum(arr1, arr1.length, k1));

        int arr2[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k2 = 4;
        System.out.println("Maximum sum of " + k2 + " consecutive elements: " + maxSum(arr2, arr2.length, k2));

        int arr3[] = {2, 3};
        int k3 = 3;
        System.out.println("Maximum sum of " + k3 + " consecutive elements: " + maxSum(arr3, arr3.length, k3));

        int arr4[] = {1, 8, 30, -5, 20, 7};
        int k4 = 3;
        System.out.println("Maximum sum of " + k4 + " consecutive elements: " + maxSum(arr4, arr4.length, k4));

        // Uncomment the following lines to test the Naive Approach
        /*
        int arrNaive[] = {1, 8, 30, -5, 20, 7};
        int kNaive = 3;
        System.out.println("Naive Approach - Maximum sum of " + kNaive + " consecutive elements: " + maxSumNaive(arrNaive, arrNaive.length, kNaive));
        */

        System.out.println("For Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
