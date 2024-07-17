// In this code we are calculating the Greatest Common Divisor of the numbers entered by the user
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static int GCD(int a,int b){
        // Method-1: Naive Solution
        /*
        int  res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
        */
        // Method-2: Euclidean Algorithm
        // Basic Idea: Let 'b' be smaller than 'a' then gcd(a,b) = gcd((a-b),b)
        /*
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
         */
        //Method-3: Optimised Euclidean Algorithm
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=GCD(a,b);
        System.out.println("Greatest Common Divisor of "+a+" and "+b+" is: "+gcd);
        System.out.println("\nFor Naive Solution:\nTime Complexity: O(min(a,b))\nSpace Complexity: O(1)\n \nFor Subtracted based Euclidean Algorithm:\nTime Complexity: O(min(a-b))\nSpace Complexity: O(1)\n");
        System.out.println("\nFor Optimised Euclidean Algorithm:\nTime Complexity: O(log(min(a,b)))\nSpace complexity: O(log(min(a,b)))");
    }
}
