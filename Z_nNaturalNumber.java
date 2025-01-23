//File : 1
import java.util.*;
public class Z_nNaturalNumber {
    public static void main(String[] args) {
        try (Scanner c = new Scanner(System.in)) {
            System.out.print("Enter n :");
            int n = c.nextInt();


            for (int i = 1; i <= n; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
