import java.io.*;
public class PrefixSumArray {
    // Naive Approach
    /*
    static int getSumNaive(int arr[], int l, int r) {
        int res = 0;
        for (int i = l; i <= r; i++) {
            res += arr[i]; // Sum up elements from index l to r
        }
        return res; // Return the computed sum
    }
    */

    // Efficient Approach
    static int[] computePrefixSum(int arr[]) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0]; // Initialize the first element of prefixSum

        // Build the prefix sum array
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // Add the current element to the prefix sum of the previous element
        }
        return prefixSum; // Return the computed prefix sum array
    }

    static int getSumEfficient(int prefixSum[], int l, int r) {
        if (l == 0) {
            return prefixSum[r]; // If l is 0, return the prefix sum at index r
        } else {
            return prefixSum[r] - prefixSum[l - 1]; // Otherwise, return the difference between prefix sums
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        int n = arr.length;

        // Efficient Approach
        int[] prefixSum = computePrefixSum(arr);

        // Using Efficient Method
        System.out.println("Efficient Approach:");
        System.out.println("Sum from 2 to 6: " + getSumEfficient(prefixSum, 2, 6)); // Output: 27
        System.out.println("Sum from 0 to 2: " + getSumEfficient(prefixSum, 0, 2)); // Output: 13
        System.out.println("Sum from 1 to 3: " + getSumEfficient(prefixSum, 1, 3)); // Output: 20

        // Uncomment the following lines to use Naive Method
        /*
        System.out.println("Naive Approach:");
        System.out.println("Sum from 2 to 6: " + getSumNaive(arr, 2, 6)); // Output: 27
        System.out.println("Sum from 0 to 2: " + getSumNaive(arr, 0, 2)); // Output: 13
        System.out.println("Sum from 1 to 3: " + getSumNaive(arr, 1, 3)); // Output: 20
        */

        System.out.println("For Naive Method:\nTime Complexity: O(n * Q)\nAuxiliary Space: O(1)");
        System.out.println("For Efficient Method:\nTime Complexity: O(n + Q)\nAuxiliary Space: O(n)");
    }
}
