// In this number we are calculating x to power y where x and y are numbers entered by the user
import java.util.Scanner;
public class Power {
    public static int power(int a,int b){
        // Method-1: Naive Solution
        /*
        int res=1;
        for(int i=1;i<=b;i++){
            res=res*a;
        }
        return res;
        */

        // Method-2: Efficient Solution
        // Basic idea: We use the fact that if n is even then power(x,n)= power(x,n/2) * power(x,n/2) and if it is odd then power(x,n)= power(x,n-1) * x
        /*
        if(b==0) return 1;
        int temp=power(a,b/2);
        temp=temp*temp;
        if(b%2==0) return temp;
        else return temp*a;
        */

        // Method-3: Iterative Solution
        // Basic Idea: 1. Every number can be written as sum of power of 2 (eg. 3^10 = 3^8 * 3^2)
        //             2. We can traverse through all bits of a number(from MSB to LSB) in O(logn) time
        int res=1;
        while(b>0){
            if(b%2!=0)      //if(b&1) using bitwise & (And operator)
                res=res*a;
            b=b/2;          //b=b>>1; using bitwise >> (Right shift operator)
            a=a*a;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=power(a,b);
        System.out.println(a+" to the power "+b+" is equal to: "+ans);
        System.out.println("\nFor Naive Solution:\nTime Complexity: Theta(n)\nSpace Complexity: Theta(1)\n \nFor Efficient Solution:\nTime Complexity: Theta(log n)\nSpace Complexity: Theta(log n)");
        System.out.println("\nFor Iterative Solution:\nTime Complexity: O(logn)\nSpace Complexity: O(1)");
    }
}
