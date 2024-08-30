import java.util.*;

//Finding greater number between three numbers.

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int btn = sc.nextInt();

        switch (btn) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("bonjur");
                break;
            default:
                System.out.println("Invalid Button");;
        }

    }
}
