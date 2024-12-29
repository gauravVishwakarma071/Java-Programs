/*
 * Basic i/o code.
 */
import java.util.*;
class sum{
    public static void main(String[] args) {
        try (Scanner lelo = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int num1 = lelo.nextInt();
            System.out.println("Enter second number");
            int num2 = lelo.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum is : "+sum );
        }
    }
}