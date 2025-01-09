//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class Sub_Product_And_Sum_OfDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();

            System.out.println(solution(n));
        }

    }
    public static int solution(int n){

        int product = 1;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n = n / 10;
        }
        return product-sum;
    }
}
