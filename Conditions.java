/*
 * Learing conditions in java. 
 */
import java.util.*;

public class Conditions {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number!");
            int num = sc.nextInt();

            if (num%2==0){
                System.out.println("Even number");
            } else{
                System.out.println("Odd number");
            }
            sc.close();
        }
    }
}
