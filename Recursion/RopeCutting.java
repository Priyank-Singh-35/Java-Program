import java.util.Scanner;
public class RopeCutting {
    // Method-1: Naive Recursive Approach
    /*
    static int maxCutsRecursive(int n, int a, int b, int c) {
        // Base case: If the length of the rope is exactly zero
        if (n == 0) return 0;

        // If the length of the rope is negative, return -1 as it's not possible to cut it
        if (n < 0) return -1;

        // Recursively calculate the maximum cuts by trying each cut size
        int res = Math.max(maxCutsRecursive(n - a, a, b, c),
                           Math.max(maxCutsRecursive(n - b, a, b, c),
                                    maxCutsRecursive(n - c, a, b, c)));

        // If no valid result is found, return -1
        if (res == -1) return -1;

        // Return the result plus one for the current cut
        return res + 1;
    }
    */

    // Method-2: Dynamic Programming Approach
    static int maxCutsDP(int n, int a, int b, int c) {
        // Array to store the maximum number of cuts for each length
        int[] dp = new int[n + 1];

        // Initialize all values to a minimum value (-1) except for dp[0] which is 0
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;

        // Compute the maximum number of cuts for each length
        for (int i = 1; i <= n; i++) {
            if (dp[i - a] != -1) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
            if (dp[i - b] != -1) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
            if (dp[i - c] != -1) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }

        // Return the result for length n, or -1 if not possible
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rope: ");
        int n = sc.nextInt();

        System.out.print("Enter the size of cut A: ");
        int a = sc.nextInt();

        System.out.print("Enter the size of cut B: ");
        int b = sc.nextInt();

        System.out.print("Enter the size of cut C: ");
        int c = sc.nextInt();

        // Uncomment the desired method to use

        // Using Method-1 (Naive Recursive Approach)
        /*
        int result = maxCutsRecursive(n, a, b, c);
        if (result == -1) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
        */

        // Using Method-2 (Dynamic Programming Approach)
        int result = maxCutsDP(n, a, b, c);
        System.out.println(result == -1 ? -1 : result);

        System.out.println("\nFor Naive Recursive Method:\nTime Complexity: O(3^n)\nSpace Complexity: O(n)\n");
        System.out.println("For Dynamic Programming Method:\nTime Complexity: O(n)\nSpace Complexity: O(n)");

        sc.close();
    }
}
