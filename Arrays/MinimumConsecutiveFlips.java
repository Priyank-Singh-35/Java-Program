import java.io.*;
public class MinimumConsecutiveFlips {
    // Method-1: Naive Approach
    /*
    static void printGroupsNaive(int arr[], int n) {
        int count0 = 0, count1 = 0;

        // Count the number of groups of 0s and 1s
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                if (arr[i] == 0) count0++;
                else count1++;
            }
        }

        // Print the groups to flip based on the minimum count
        if (count0 <= count1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1] && arr[i] == 0) {
                    System.out.print("From " + i + " to ");
                } else if (arr[i] != arr[i - 1] && arr[i] == 1) {
                    System.out.println(i - 1);
                }
            }
            if (arr[n - 1] == 0) System.out.println(n - 1);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1] && arr[i] == 1) {
                    System.out.print("From " + i + " to ");
                } else if (arr[i] != arr[i - 1] && arr[i] == 0) {
                    System.out.println(i - 1);
                }
            }
            if (arr[n - 1] == 1) System.out.println(n - 1);
        }
    }
    */

    // Method-2: Efficient Approach
    static void printGroups(int arr[], int n) {
        // Traverse through all array elements starting from the second element
        for (int i = 1; i < n; i++) {
            // If current element is not the same as previous
            if (arr[i] != arr[i - 1]) {
                // If it is same as the first element, then it is starting of the interval to be flipped
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }
        // Explicitly handle the end of the last interval
        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }

    public static void main(String[] args) {
        // Given array arr[]
        int[] arr = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}; // Example array
        int n = arr.length;

        // Using Method-2 (Efficient Approach)
        printGroups(arr, n);

        // Uncomment the following lines to use Method-1 (Naive Approach)
        /*
        int arrNaive[] = {1, 1, 0, 0, 0, 1}; // Example array for naive approach
        int nNaive = arrNaive.length;
        printGroupsNaive(arrNaive, nNaive);
        */

        System.out.println("For Efficient Method:\nTime Complexity: O(N)\nAuxiliary Space: O(1)");
        System.out.println("For Naive Method:\nTime Complexity: O(N^2)\nAuxiliary Space: O(1)");
    }
}
