//In this code we are calculating the number of set bits(1) in the Binary representation of the number entered by the user
import java.util.Scanner;
public class CountSetBits {
    public static int CountBits(int n){
        //Method-1: Naive Solution
        int res=0;
        while(n>0){
            if(n%2==1)
                res++;
            n=n/2;
        }
        return res;

        //Method-2: Efficient Solution
        /*
        int count = 0;
        int x = 1;
        while (x <= n) {
            int quotient = n / (x * 2);
            count += quotient * x;
            int remainder = n % (x * 2);
            count += Math.max(0, remainder - x + 1);
            x = x << 1;
        }
        return count;
        */
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=CountBits(n);
        System.out.println("The number of set bits in "+n+" is: "+ans);
        System.out.println("\nFor Naive Solution:\nTime Complexity: O(n)\nSpace Complexity: Theta(1)\n \nFor Efficient Solution:\nTime Complexity: O(logn)\nSpace Complexity: O(1)");
    }
}
