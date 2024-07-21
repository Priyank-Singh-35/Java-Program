public class DuplicateRemove {
    // Method-1: Using extra space to remove duplicates
    /*
    static int remDupsWithExtraSpace(int arr[], int n)
    {
        int temp[] = new int[n];

        temp[0] = arr[0];
        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(temp[res - 1] != arr[i])
            {
                temp[res] = arr[i];
                res++;
            }
        }

        for(int i = 0; i < res; i++)
        {
            arr[i] = temp[i];
        }

        return res;
    }
    */

    // Method-2: Removing duplicates using constant extra space
    static int remDups(int[] arr, int n)
    {
        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String args[])
    {
        int[] arr = {10, 20, 20, 30, 30, 30};
        int n = 6;

        System.out.println("Before Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Uncomment the following line to use Method-1
        /*
        n = remDupsWithExtraSpace(arr, n);
        */

        // Using Method-2
        n = remDups(arr, n);

        System.out.println("After Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Time and space complexity details
        System.out.println("\nFor Method-1 (Using extra space):\nTime Complexity: O(n)\nAuxiliary Space: O(n)");
        System.out.println("For Method-2 (Constant extra space):\nTime Complexity: O(n)\nAuxiliary Space: O(1)");
    }
}
