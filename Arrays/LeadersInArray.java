class LeadersInArray
{
    // Naive Approach: Using nested loops to find leaders
    /*
    void printLeadersNaive(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // The loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
    */

    // Optimized Approach: Using suffix maximum to find leaders
    void printLeaders(int arr[], int size)
    {
        int max_from_right = arr[size - 1];

        // Rightmost element is always a leader
        System.out.print(max_from_right + " ");

        for (int i = size - 2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;

        // Uncomment the following line to use the Naive Approach
        /*
        System.out.println("Naive Approach:");
        lead.printLeadersNaive(arr, n);
        System.out.println("\nTime Complexity: O(N * N)\nAuxiliary Space: O(1)");
        */

        // Using Optimized Approach
        System.out.println("Optimized Approach:");
        lead.printLeaders(arr, n);
        System.out.println("\nTime Complexity: O(n)\nAuxiliary Space: O(1)");
    }
}
