/*
 * Finding nth fibonacci number.
 */
import java.util.*;
public class FibonacciNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number..?");
            int n = sc.nextInt();
            System.out.println("The "+n+"th fibinacci number is : "+fibo(n));
        }
        
    }
        
    public static int fibo(int n) {
        if(n==0) return 0;
		if(n==1||n==2) return 1;
        return fibo(n-1) + fibo(n-2);  
    }
}
