// In this Code we are Calculating the number of trailing zeroes in the factorial of the number inserted by the user
import java.util.Scanner;
public class TrailingZeroInFactorial {
    public static int TrailingZero(int n){
        // Method-1: Naive Solution
        /*
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        int res=0;
        while(fact%10==0){
            res++;
            fact=fact/10;
        }
        return res;

         */
        //Method-2: Efficient Solution
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count=count+(n/i);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zero=TrailingZero(n);
        System.out.println("Number of trailing Zeroes in Factorial of "+n+" is: "+zero);
        System.out.println("\nFor Naive Solution:\nTime Complexity: Theta(n)\nSpace Complexity: Theta(1)\nNote:The Naive solution is not the best solution cause it will cause overflow for even slightly higher value\n \nFor Efficient Solution:\nTime Complexity: Theta(log n) cause 5^k <= n it implies k <= log_5 n where 5 is base of log\nSpace Complexity: Theta(1)");
    }
}
