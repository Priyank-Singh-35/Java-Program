// In this code we are calculating the Least Common Multiple of the two numbers entered by the user
import java.util.Scanner;
public class LeastCommonMultiple {
    public static int gcd(int a,int b){
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        // Method-1: Naive Solution
        /*
        int res=Math.max(a,b);
        while(res>0){
            if(res%a==0 && res%b==0)
                break;
            else
                res++;
        }return res;
         */
        // Method-2: Efficient Solution
        // Basic idea: a*b = gcd(a,b) * lcm(a,b) it implies lcm(a,b) = a*b / gcd(a,b) so find gcd using Euclidean then find lcm
        return a*b / gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lc=lcm(a,b);
        System.out.println("Greatest Common Divisor of "+a+" and "+b+" is: "+lc);
        System.out.println("\nFor Naive Solution:\nTime Complexity: O(a*b-max(a,b))\nSpace Complexity: O(1)\n \nFor Efficient Solution based on Euclidean Algorithm:\nTime Complexity: O(log(min(a-b)))\nSpace Complexity: O(log(min(a,b)))\n");
    }
}
