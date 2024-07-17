//In this code we are checking if the kth bit is set or not in the number entered by the user where k is also user input
import java.util.Scanner;
public class KthSetBit {
    public static void SetBit(int n,int k){
        // Method-1: Naive Solution
        /*
        int x=1;
        for(int i=0;i<(k-1);i++)         //for(int i=0;i<(k-1);i++)  n=n/2;
            x=x*2;
        if((n&(1<<k))!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
        */

        // Method-2: Efficient Solution
        int x=(1<<(k-1));                // int x=(n>>(k-1));
        if((n&x)!=0)                     // if((x&1)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        SetBit(n,k);
        System.out.println("\nFor Naive Solution:\nTime Complexity: Theta(k)\nSpace Complexity: Theta(1)\n \nFor Efficient Solution:\nTime Complexity: Theta(1)\nSpace Complexity: Theta(1)");
    }
}
