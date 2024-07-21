import java.util.Scanner;
public class PalindromeChecker {
    // Method-1: Recursive Function to check if a string is a palindrome
    /*
    static boolean isPalindromeRecursively(String str, int start, int end) {
        // Base case: A string with one character or no character is a palindrome
        if (start >= end) {
            return true;
        }

        // If the first and last characters do not match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recur for the substring with the first and last characters removed
        return isPalindromeRecursively(str, start + 1, end - 1);
    }

    static boolean isPalindrome(String str) {
        // An empty string is considered a palindrome
        if (str == null || str.isEmpty()) {
            return true;
        }

        return isPalindromeRecursively(str, 0, str.length() - 1);
    }
    */

    // Method-2: Another Recursive Approach to check if a string is a palindrome
    static boolean isPalindromeRecursive(String s, int i) {
        // Base case: We have checked all characters up to the middle
        if (i >= s.length() / 2) {
            return true;
        }

        // Check if the i-th character and its counterpart are equal
        return s.charAt(i) == s.charAt(s.length() - i - 1) && isPalindromeRecursive(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();

        // Uncomment the desired method to use

        // Using Method-1
        /*
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        */

        // Using Method-2
        if (isPalindromeRecursive(str, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("\nFor Recursive Method-1:\nTime Complexity: O(n)\nAuxiliary Space: O(n)\n");
        System.out.println("For Recursive Method-2:\nTime Complexity: O(n)\nAuxiliary Space: O(n)");
    }
}

