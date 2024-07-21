import java.util.*;
public class LongestAlternatingEvenOddSubarray {
    // Method-1: Naive Approach
    /*
    static int longestEvenOddSubarrayNaive(ArrayList<Integer> a, int n) {
        int ans = 1; // Initialize result variable to store maximum length of alternating subarray

        // Iterate through each possible starting index
        for (int i = 0; i < n; i++) {
            int cnt = 1; // Length of the current alternating subarray

            // Check subarrays starting from index i
            for (int j = i + 1; j < n; j++) {
                // Check if current element alternates in parity compared to previous element
                if ((a.get(j - 1) % 2 == 0 && a.get(j) % 2 != 0) ||
                    (a.get(j - 1) % 2 != 0 && a.get(j) % 2 == 0)) {
                    cnt++; // Increment length if alternating
                } else {
                    break; // Break if the alternation pattern is broken
                }
            }

            // Update the maximum length found
            ans = Math.max(ans, cnt);
        }

        // Return 0 if no valid alternating subarray found
        if (ans == 1) return 0;
        return ans;
    }
    */

    // Method-2: Efficient Approach (Storing the Previous Element's Parity)
    static int maxEvenOdd(int[] arr, int n) {
        if (n == 0) return 0; // Return 0 if array is empty

        int maxLength = 0; // Variable to store the maximum length of the alternating subarray
        int prevOdd = arr[0] % 2; // Store the parity of the first element (0 for even, 1 for odd)
        int curLength = 1; // Start with length 1 for the first element

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Check if the current element's parity is different from the previous element's parity
            if (arr[i] % 2 != prevOdd) {
                curLength++; // Increment length if alternating
            } else {
                curLength = 1; // Reset length if pattern is broken
            }

            // Update maximum length if the current length is greater
            if (curLength > maxLength) {
                maxLength = curLength;
            }

            // Update the parity of the previous element
            prevOdd = arr[i] % 2;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Given array arr[]
        int[] arr = {1, 2, 3, 4, 5, 3, 7, 2, 9, 4};
        int n = arr.length;

        // Using Method-2 (Efficient Approach)
        System.out.println("Length of longest subarray of alternating even and odd elements: " + maxEvenOdd(arr, n));

        // Uncomment the following lines to use Method-1 (Naive Approach)
        /*
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8));
        System.out.println("Length of longest alternating even-odd subarray (Naive Approach): " + longestEvenOddSubarrayNaive(arrayList, arrayList.size()));
        */

        System.out.println("For Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
