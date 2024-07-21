import java.util.Scanner;
public class OddOccurrences {
    // Method-1: Brute Force Solution to find the elements occurring odd number of times
    /*
    static void findOddOccurrencesBruteForce(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0) {
                System.out.print(arr[i] + " ");
                // To ensure we only print each odd occurring element once
                for (int k = i + 1; k < n; k++) {
                    if (arr[k] == arr[i]) {
                        arr[k] = 0;
                    }
                }
            }
        }
        System.out.println();
    }
    */

    // Method-2: Efficient Solution to find the elements occurring odd number of times using XOR
    static void findOddOccurrencesXOR(int arr[], int n) {
        int xor = 0, res1 = 0, res2 = 0;

        // Step 1: XOR of all elements to get xor of two odd occurring elements
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        // Step 2: Find a set bit in xor (rightmost set bit)
        int setBit = xor & ~(xor - 1);

        // Step 3: Divide elements into two groups and XOR them separately
        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }

        System.out.println("The two odd occurring numbers are: " + res1 + " and " + res2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding the elements occurring odd number of times using XOR method
        findOddOccurrencesXOR(arr, n);

        // Uncomment the below lines to use the Brute Force method
        /*
        System.out.print("The two odd occurring numbers (Brute Force) are: ");
        findOddOccurrencesBruteForce(arr, n);
        */

        System.out.println("\nFor Brute Force Solution:\nTime Complexity: O(n^2)\nSpace Complexity: O(1)\n");
        System.out.println("For Efficient Solution (XOR):\nTime Complexity: O(n)\nSpace Complexity: O(1)");
    }
}

