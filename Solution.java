/*
 * Fibonacci series.
 */
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int ans = fibo(n);
			System.out.println(ans);
		}
	}
	public static int fibo(int n){
		if(n==0) return 0;
		if(n==1||n==2) return 1;
		
		return fibo(n - 1) + fibo(n - 2);
	}
}

