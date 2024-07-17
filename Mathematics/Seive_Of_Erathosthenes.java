// In this code we are printing all the prime numbers from 2 to the number entered by the user using Seive of Erathosthenes Algorithm
import java.util.Arrays;
import java.util.Scanner;
public class SeiveOfErathosthenes {
    /*
    public static boolean isPrime(int n){
        if(n==1) return false;
        else if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    */
    public static void Sieve(int n){
        // Method-1: Naive Solution
        /*
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        */

        // Method-2: Seive Of Erathosthenes Algorithm
        // Basic Idea: Create an isPrime[n+1] boolean array initialising it  as all true and then start from 2 and mark every multiple of it false then continue for 3,... and now all the remaining true numbers are prime numbers
        /*

        boolean[] Prime=new boolean[n+1];
        Arrays.fill(Prime,true);   // Initialising all values to true
        for(int i=2;i*i<=n;i++){
            if(Prime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    Prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(Prime[i]){
                System.out.println(i);
            }
        }
        */

        // Method-3: Optimised Seive Algorithm
        // Basic Idea: We replace 2*i from j loop with i*i because we have already accounted for other composite numbers with the multiple, and also we will reduce the length of code by integrating the other for loop and changing the condition of i loop with i<=n
        boolean[] Prime=new boolean[n+1];
        Arrays.fill(Prime,true);   // Initialising all values to true
        for(int i=2;i<=n;i++){
            if(Prime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i){
                    Prime[j]=false;
                }
            }
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sieve(n);
        System.out.println("\nFor Naive Solution:\nTime Complexity: O(n * square root n)\nSpace Complexity: Theta(1)\n \nFor Seive Of Erathosthenes Algorithm:\nTime Complexity: O(n loglog n)\nSpace Complexity: O(1)");
        System.out.println("\nFor Optimised Seive Algorithm:\nTime Complexity: O(n loglog n)\nSpace Complexity: Theta(1)\n");
    }
}
