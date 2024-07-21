public class MaximumOccurredElement {
    // Naive Approach
    /*
    static int maximumOccurredElementNaive(int[] l, int[] r, int n) {
        int maxRange = 100; // This should be adjusted based on the problem constraints
        int[] freq = new int[maxRange + 1];

        // Count frequencies of each element in all ranges
        for (int i = 0; i < n; i++) {
            for (int j = l[i]; j <= r[i]; j++) {
                if (j < freq.length) {
                    freq[j]++;
                }
            }
        }

        // Find the maximum frequency and corresponding element
        int res = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[res]) {
                res = i;
            }
        }
        return res;
    }
    */

    // Efficient Approach
    static int MAX = 1000000; // Adjust MAX based on the problem constraints

    // Return the maximum occurred element in all ranges.
    static int maximumOccurredElement(int[] L, int[] R, int n) {
        // Initialize array to store the frequency impact of each index
        int[] arr = new int[MAX + 1]; // +1 to handle boundary conditions

        int maxi = -1;

        // Apply the difference array concept
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1; // Increment at the start of the range
            if (R[i] + 1 < arr.length) {
                arr[R[i] + 1] -= 1; // Decrement just after the end of the range
            }
            if (R[i] > maxi) {
                maxi = R[i]; // Track the maximum end value
            }
        }

        // Find the prefix sum and the index with the maximum prefix sum
        int msum = arr[0];
        int ind = 0;
        for (int i = 1; i <= maxi; i++) {
            arr[i] += arr[i - 1];
            if (msum < arr[i]) {
                msum = arr[i];
                ind = i;
            }
        }

        return ind;
    }

    public static void main(String[] args) {
        int[] L = {1, 4, 9, 13, 21};
        int[] R = {15, 8, 12, 20, 30};
        int n = L.length;

        // Using Efficient Approach
        System.out.println("Efficient Approach:");
        System.out.println("Maximum Occurred Element: " + maximumOccurredElement(L, R, n)); // Output: 5

        // Uncomment the following lines to use Naive Approach
        /*
        System.out.println("Naive Approach:");
        System.out.println("Maximum Occurred Element: " + maximumOccurredElementNaive(L, R, n)); // Output
        */

        System.out.println("For Naive Method:\nTime Complexity: O(N * M), where M is the maximum range length\nAuxiliary Space: O(M)");
        System.out.println("For Efficient Method:\nTime Complexity: O(N + MAX)\nAuxiliary Space: O(MAX)");
    }
}
