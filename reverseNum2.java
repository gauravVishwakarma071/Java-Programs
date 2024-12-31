/*
 * reversing a given number.
 */
import java.util.*;
public class reverseNum2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number..?");
            int n = sc.nextInt();
            System.out.println(revNum(n));
        }
    }
    
    public static int revNum(int n){
        int ans=0;
        while(n>0){
            ans = (ans*10) + (n % 10);
            n/=10;
        }
        return ans;
    }
}
