/*
 * To find the factorial of a given number by using recursion.
 */
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println(fac(n));
        }
    }

    public static int fac(int n){
        if(n==1||n==0){
            return 1;
        }
        return n * fac(n-1);
    }
}
