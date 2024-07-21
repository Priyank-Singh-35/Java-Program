import java.io.*;
public class TowerOfHanoi_Recursion {

    // Method-1: Recursive Solution to solve Tower of Hanoi puzzle
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // Base case: If there are no disks to move
        if (n == 0) {
            return;
        }

        // Step 1: Move n-1 disks from 'from_rod' to 'aux_rod' using 'to_rod' as auxiliary
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);

        // Step 2: Move the nth disk from 'from_rod' to 'to_rod'
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);

        // Step 3: Move n-1 disks from 'aux_rod' to 'to_rod' using 'from_rod' as auxiliary
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code
    public static void main(String[] args) {
        int N = 3; // Number of disks

        // Call the recursive function to solve the Tower of Hanoi puzzle
        System.out.println("Tower of Hanoi Solution:");
        towerOfHanoi(N, 'A', 'C', 'B');

        System.out.println("\nTime Complexity: O(2^N)");
        System.out.println("Auxiliary Space: O(N)");
    }
}
