/*
 * Methods to Write Prime Number Program in Java
 */
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check prime or not");
        int n = sc.nextInt();
        
        if(primeCheck(n)==true) System.out.println("PRIME");
        if(primeCheck(n)==false) System.out.println("NOT PRIME");

    }   

    public static boolean primeCheck(int n){

        if(n<=1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

}
