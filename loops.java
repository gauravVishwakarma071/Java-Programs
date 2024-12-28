/*
 * Learing loop in java.
 */
import java.util.*;

public class loops {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number!");
            int num = sc.nextInt();
            
            int sum =0;
            for(int i = 1; i<=num;i++){
                sum+=i;
            }
            System.out.println("The sum first "+num+" natural numbers is : "+sum);
        }
    }
}
