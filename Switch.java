/*
 * Finding greater number between three numbers by using switch.
 */
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int btn = sc.nextInt();

        switch (btn) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("bonjur");
            default -> {
                System.out.println("Invalid Button");
            }
        }

    }
}
