//Reverse A String In Java
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String name = sc.nextLine();

            System.out.print("Output : ");
            for (int i = name.length()-1; i >= 0 ; i--) {
                System.out.print(name.charAt(i));
            }
        }
    }
}
