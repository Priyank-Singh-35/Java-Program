import java.util.Scanner;
public class OddOccurrence {

    // Method-1: Brute Force Solution to find the element occurring odd number of times
    /*
    static int getOddOccurrenceBruteForce(int arr[], int arr_size) {
        for (int i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
    */

    // Method-2: Efficient Solution to find the element occurring odd number of times using XOR
    static int getOddOccurrenceXOR(int arr[], int arr_size) {
        int res = 0;
        for (int i = 0; i < arr_size; i++) {
            res = res ^ arr[i];
        }
        return res;
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

        // Finding the element occurring odd number of times using XOR method
        int result = getOddOccurrenceXOR(arr, n);
        System.out.println("The number occurring an odd number of times is: " + result);

        // Uncomment the below lines to use the Brute Force method
        /*
        int resultBruteForce = getOddOccurrenceBruteForce(arr, n);
        System.out.println("The number occurring an odd number of times (Brute Force) is: " + resultBruteForce);
        */

        System.out.println("\nFor Brute Force Solution:\nTime Complexity: O(n^2)\nSpace Complexity: O(1)\n");
        System.out.println("For Efficient Solution (XOR):\nTime Complexity: O(n)\nSpace Complexity: O(1)");
    }
}
