//Write a function to print all the prime number in between given range.
import java.util.*;
public class AllPrimeInRange_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter initial range");
            int a = sc.nextInt();
            System.out.println("Enter final range");
            int b = sc.nextInt();

            allPrime(a, b);
            
        }       
    }

    public static void  allPrime(int a, int b){
        for (int i = a; i < b; i++) {
            boolean ans = true;
            for (int j = 2; j < (i/2)+1 ; j++) {
                if(i<=1){
                    ans = false;
                }
                if(i%j==0){
                    ans = false;
                }
            }
            if(ans==true) System.out.print(i+" ");
        }
    }
}
