import java.util.Scanner;
public class PowerOfTwo {
    // Method-1: Using Math.log to check if a number is a power of 2
    /*
    public static boolean isPowerOfTwoMath(int n) {
        if (n == 0)
            return false;
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor((Math.log(n) / Math.log(2))));
    }
    */

    // Method-2: Using bitwise AND to check if a number is a power of 2
    public static boolean isPowerOfTwoBitwise(long n) {
        return (n != 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        // Checking if the number is a power of two using bitwise method
        if (isPowerOfTwoBitwise(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }

        // Uncomment the below lines to use the Math.log method
        /*
        if (isPowerOfTwoMath(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        */

        System.out.println("\nFor Method-1 (Math.log):\nTime Complexity: O(1)\nSpace Complexity: O(1)\n");
        System.out.println("For Method-2 (Bitwise AND):\nTime Complexity: O(1)\nSpace Complexity: O(1)");
    }
}

