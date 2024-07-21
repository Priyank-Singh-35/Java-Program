import java.util.Scanner;
public class Print_1_to_N {
    // Method-1: Iterative Solution to print numbers from 1 to N
    /*
    static void printNumbersIterative(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    */

    // Method-2: Recursive Solution to print numbers from 1 to N
    static void printNumbersRecursive(int n) {
        if (n > 0) {
            printNumbersRecursive(n - 1);
            System.out.print(n + " ");
        }
        // Base case: When n <= 0, the recursion stops
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Printing numbers from 1 to N using the recursive method
        printNumbersRecursive(N);

        // Uncomment the below lines to use the Iterative method
        /*
        System.out.print("Numbers from 1 to N (Iterative): ");
        printNumbersIterative(N);
        */

        System.out.println("\nFor Iterative Solution:\nTime Complexity: O(N)\nSpace Complexity: O(1)\n");
        System.out.println("For Recursive Solution:\nTime Complexity: O(N)\nSpace Complexity: O(N)");
    }
}
