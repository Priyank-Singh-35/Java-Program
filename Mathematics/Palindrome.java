// In this code we check if a number is Palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static boolean PalindromeNo(int n){
        int last=0,count=0;
        int temp=n;
        while(temp>0){
            last=temp%10;
            count=count*10+last;
            temp=temp/10;
        }
        return (count==n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=PalindromeNo(n);
        if(res){
            System.out.println(n+" is a Palindrome number");
        }
        else{
            System.out.println(n+" is not a Palindrome number");
        }
        System.out.println("\nTime Complexity: Theta(d) where d is the number of digits\nSpace Complexity: Theta(1) means constant space");
    }
}
