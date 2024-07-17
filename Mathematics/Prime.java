// In this code we are checking if the number entered by the user is Prime number or not
import java.util.Scanner;
public class Prime {
    public static boolean prime(int n){
        // Method-1: Naive Solution
        /*
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
         */

        // Method-2: Efficient Solution
        // Basic Idea: Divisors always appear in pair it means instead of running loop from 2 to n you can run it from 2 to square root of n.
        /*
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
        */

        // Method-3: More Efficient Solution
        // Basic Idea: Add two more checks for n%2==0 and n%3==0 which will help reduce a lot of iterations and make some more changes in for loop for making it more efficient
        if(n==1) return false;
        else if (n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=prime(n);
        if(res)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");

        System.out.println("\nFor Naive Solution:\nTime Complexity: O(n)\nSpace Complexity: O(1)\n \nFor Efficient Solution:\nTime Complexity: O(square root n)\nSpace Complexity: O(1)");
        System.out.println("\nFor Most Efficient Solution:\nTime Complexity: O(square root n)\nSpace Complexity: O(1) but note in this solution the number of iteration are less which makes it more efficient than the previous\n");
    }
}
