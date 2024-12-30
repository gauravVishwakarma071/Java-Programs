/*
 * Table of any number.
 */
import java.util.*;

public class Table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number..!");
            int num = sc.nextInt();

            int i=1;
            while(i<11){
                System.out.println(num+" * "+i+" = "+i*num);
                i++;
            }
        }
    }
}
