import java.util.Scanner;
public class PowerSet {
    // Method to print the power set of the given set
    static void printPowerSet(char[] set) {
        int setSize = set.length;
        int powerSetSize = (int) Math.pow(2, setSize);

        // Loop through all possible subsets
        for (int counter = 0; counter < powerSetSize; counter++) {
            for (int j = 0; j < setSize; j++) {
                // Check if jth bit in the counter is set
                if ((counter & (1 << j)) != 0) {
                    System.out.print(set[j]);
                }
            }
            System.out.println(); // Print a new line for the next subset
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the set (e.g., abc): ");
        String input = sc.nextLine();
        char[] set = input.toCharArray();

        // Print the power set of the given set
        printPowerSet(set);

        System.out.println("\nTime Complexity: O(n * 2^n)");
        System.out.println("Auxiliary Space: O(1)");
    }
}

