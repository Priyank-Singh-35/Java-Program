import java.util.*;
public class MaximumSumSubarray {

    // Method-1: Naive Approach
    /*
    static void findMaxSumSubarrayNaive(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        // Traverse all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                // Calculate sum of subarray from i to j
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // Update maxSum if this subarray sum is greater
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        // Print the subarray with maximum sum
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    */

    // Method-2: Efficient Approach (Kadane's Algorithm with Subarray Tracking)
    static void findMaxSumSubarrayEfficient(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int globalMax = arr[0];
        int startIndex = 0, endIndex = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > currMax + arr[i]) {
                currMax = arr[i];
                tempStart = i;
            } else {
                currMax += arr[i];
            }

            if (currMax > globalMax) {
                globalMax = currMax;
                startIndex = tempStart;
                endIndex = i;
            }
        }

        // Print the subarray with maximum sum
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Given array arr[]
        int[] arr = { -2, -5, 6, -2, -3, 1, 5, -6 };

        // Using Method-2 (Efficient Approach)
        System.out.println("Subarray with the maximum sum:");
        findMaxSumSubarrayEfficient(arr);

        // Uncomment the following lines to use Method-1 (Naive Approach)
        /*
        System.out.println("\nSubarray with the maximum sum (Naive Approach):");
        findMaxSumSubarrayNaive(arr);
        */

        System.out.println("\nFor Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
