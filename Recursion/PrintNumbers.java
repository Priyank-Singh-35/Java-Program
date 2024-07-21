import java.util.*;
public class Print_N_to_1 {
    // Recursive function to print from N to 1
    static void PrintReverseOrder(int N)
    {
        for (int i = N; i > 0; i--)
            System.out.print( +i + " ");
    }
    // Driver code
    public static void main(String[] args)
    {
        int N = 5;
        PrintReverseOrder(N);
        System.out.println("\nTime Complexity: O(n)\nSpace Complexity: O(1)\n");
    }
}

