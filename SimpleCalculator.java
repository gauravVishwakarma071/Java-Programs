/*
 * Simple calculator by using Switch.
 */
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           
            while(true){ 
            System.out.println("Enter first number");
            int a = sc.nextInt();
            
            System.out.println("Enter second number");
            int b = sc.nextInt();
            
            System.out.println("Enter an arithemetic operator");
            char op = sc.next().charAt(0);
                
            switch (op) {
                case '+' -> System.out.println(a+b);
                case '-' -> System.out.println(a-b);
                case '*' -> System.out.println(a*b);
                case '/' -> System.out.println(a/b);
                case '%' -> System.out.println(a%b);
                default -> {
                    System.out.println("Invalid operator");
                }
            }}
        }
    }
}
