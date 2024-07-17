// In this code we are calculating all the prime factors of the number entered by the user
import java.util.Scanner;
public class PrimeFactor {
    public static boolean isPrime(int n){
        if(n==1) return false;
        else if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void PrimeFactors(int n){
        System.out.println("Prime factors of "+n+" are: ");
        // Method-1: Naive Solution
        /*
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
         */

        // Method-2: Efficient Solution
        // Basic Idea: 1. Divisors always appear in pair it means instead of running loop from 2 to n you can run it from 2 to square root of n.
        //             2. A number n can be written as multiplications of power of prime factors
        /*
        if(n<=1) return ;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
         */

        // Method-3: More Efficient Solution
        // Basic Idea: Add two more checks for n%2==0 and n%3==0 which will help reduce a lot of iterations and make some more changes in for loop for making it more efficient
        if(n<=1) return;
        while(n%2==0){
            System.out.println("2");
            n=n/2;
        }
        while(n%3==0){
            System.out.println("3");
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeFactors(n);
        System.out.println("\nFor Naive Solution:\nTime Complexity: O(n logn)\nSpace Complexity: O(1)\n \nFor Efficient Solution:\nTime Complexity: O(square root n)\nSpace Complexity: O(1)");
        System.out.println("\nFor Most Efficient Solution:\nTime Complexity: O(square root n)\nSpace Complexity: O(1) but note in this solution the number of iteration are less which makes it more efficient than the previous\n");
    }
}
