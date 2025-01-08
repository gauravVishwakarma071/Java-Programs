//Write a function to print all the prime number in between given range.
import java.util.*;
public class AllPrimeInRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter initial range");
            int a = sc.nextInt();
            System.out.println("Enter final range");
            int b = sc.nextInt();

            for (int i = a; i < b; i++) {
               if(allPrime(i)==true){
                System.out.println(i);
               }
            }
        }       
    }

    public static boolean  allPrime(int i){

        for (int j = 2; j <= (i/2)+1; j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
