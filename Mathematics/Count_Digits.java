// A Simple program where we count the number of digits in the number input by the user
import java.util.Scanner;
public class CountDigits {
    public static int CountDigit(int n){
        int r=0;
        while(n>0){
            n=n/10;
            r++;
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=CountDigit(n);
        System.out.println("The Count of digits is: "+count);
        System.out.println("\nTime Complexity: Theta(d) where d is the number of digits\nSpace Complexity: Theta(1) it means it will take constant space");
    }
}
