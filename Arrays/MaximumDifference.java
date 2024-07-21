class MaximumDifference
{
    // Method 1: Simple Approach using nested loops
    /*
    int maxDiffSimple(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++)
        {
            for (j = i + 1; j < arr_size; j++)
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }
    */

    // Method 2: Efficient Approach using tracking minimum element
    int maxDiffEfficient(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr_size; i++)
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
    }

    public static void main(String[] args)
    {
        MaximumDifference maxdif = new MaximumDifference();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;

        // Uncomment the following lines to use the Simple Approach
        /*
        System.out.println("Using Simple Approach:");
        System.out.println("Maximum difference is " + maxdif.maxDiffSimple(arr, size));
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Auxiliary Space: O(1)");
        */

        // Using Efficient Approach
        System.out.println("Using Efficient Approach:");
        System.out.println("Maximum difference is " + maxdif.maxDiffEfficient(arr, size));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Auxiliary Space: O(1)");
    }
}
