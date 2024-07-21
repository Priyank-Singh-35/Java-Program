import java.io.*;
public class JosephusProblem_Recursion
{
    // Method-1: Recursive Solution to find the safe position in the Josephus problem
    static int josephus(int n, int k) {
        // Base case: If there is only one person, they are the survivor
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: Adjust the position returned by the recursive call
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 14; // Total number of persons
        int k = 2;  // Number of persons to be skipped

        // Call the recursive function to find the safe position
        System.out.println("The chosen place is " + josephus(n, k));

        System.out.println("\nTime Complexity: O(n)");
        System.out.println("Space Complexity: O(n) due to recursion call stack");
    }
}

