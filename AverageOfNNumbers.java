//Calculate Average Of N Numbers.
import java.util.*;
public class AverageOfNNumbers {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number...?");
            int n = sc.nextInt();
            solution(n);
        }
    }

    public static void solution(int n){
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            count++;
        }
        float avg = sum/count;
        System.out.println("The avarage of "+n+" natural number are : "+ avg);
    }
}
