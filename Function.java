/*
 * Learing function in java.
 */
import java.util.*;
public class Function {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a num..!");
            int n = sc.nextInt();
            int result = fac(n);
            System.out.println(result);
            sc.close();
        }
    }
    public static int fac(int n){
        if(n<1){
            System.out.println("Invailid Number");
            return 0;
        }
        int fac = 1;
        for(int i=n;i>=1;i--){
            fac *= i;
        }
        return fac;
    }
    
}
