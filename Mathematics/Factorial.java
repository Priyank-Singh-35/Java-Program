// In this code we are calculating the Factorial of the number input by the user
import java.util.Scanner;
public class Factorial {
    public static int FactorialNo(int n){
        // Method-1: Iterative Solution
        int res=1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=2;i<n;i++){
            res=res*i;
        }
        return res;

        //Method-2: Recursive Solution
        /*
        if(n==0){
            return 1;
        }
        return n*FactorialNo(n-1);
         */
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=FactorialNo(n);
        System.out.println("Factorial of "+n+" is: "+fact);
        System.out.println("\nFor iterative Solution:\nTime Complexity: Theta(n)\nSpace Complexity: Theta(1)\n \nFor recursive Solution:\nTime Complexity: Theta(n)\nSpace Complexity: Theta(n)");
    }
}
