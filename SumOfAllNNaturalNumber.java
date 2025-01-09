//Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class SumOfAllNNaturalNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();

            System.out.println(sumOfNNaturalNumber(n));
        }
    }

    public static int sumOfNNaturalNumber(int n){
        int ans = 0;
        for (int i = 1; i <= n; i++){
            ans = ans + i;
        }
        return ans;
    }
}
