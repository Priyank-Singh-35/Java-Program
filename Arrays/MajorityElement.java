import java.util.*;
public class MajorityElement {
    // Method-1: Naive Approach
    /*
    static void findMajorityNaive(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // Sentinel value for index

        // Traverse through each element to count its occurrences
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // Update maxCount and index if count of current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // Check if the element occurs more than n/2 times
        if (maxCount > n / 2)
            System.out.println("Majority Element: " + arr[index]);
        else
            System.out.println("No Majority Element");
    }
    */

    // Method-2: Efficient Approach using Moore’s Voting Algorithm
    static void printMajority(int a[], int size) {
        // Find the candidate for Majority
        int cand = findCandidate(a, size);

        // Print the candidate if it is Majority
        if (isMajority(a, size, cand))
            System.out.println("Majority Element: " + cand);
        else
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority using Moore's Voting Algorithm */
    static int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;

        // Loop to find the candidate
        for (int i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more than n/2 times */
    static boolean isMajority(int a[], int size, int cand) {
        int count = 0;

        // Count occurrences of candidate
        for (int i = 0; i < size; i++) {
            if (a[i] == cand)
                count++;
        }
        return count > size / 2;
    }

    public static void main(String[] args) {
        // Given array arr[]
        int[] arr = {1, 3, 3, 1, 2}; // Example array
        int n = arr.length;

        // Using Method-2 (Efficient Approach)
        printMajority(arr, n);

        // Uncomment the following lines to use Method-1 (Naive Approach)
        /*
        int arrNaive[] = {3, 3, 4, 2, 4, 4, 2, 4}; // Example array for naive approach
        int nNaive = arrNaive.length;
        findMajorityNaive(arrNaive, nNaive);
        */

        System.out.println("For Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
