import java.util.Scanner;

public class Exception_01 {

    static int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Can't devide by 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                System.out.println(divide(a, b));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("number can't be divide by ");
            }
        }
    }
}