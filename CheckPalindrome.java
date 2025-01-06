import java.util.*;
public class CheckPalindrome {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check palindrome or not ");
            int n = sc.nextInt();
            
            if(palindrome(n)==n){
                System.out.println("The "+n+ " is a palindrome number.");
            }else{
                System.out.println("The "+n+ " is not a palindrome number.");
            }
        }

    }

    public static int palindrome(int n){
        
        int ans = 0;
        while(n>0){
        int rem = n % 10;
        ans = (ans * 10 ) + rem;
        n /= 10;
        }
        return ans;
    }
}
