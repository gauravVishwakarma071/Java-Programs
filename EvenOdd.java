/*
 * De fine a method to find out thata givan number is Even or Odd..?
 */
import java.util.*;         
public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number..?");
            int a = in.nextInt();
            evenOdd(a);
        }
    }
    
    public static void evenOdd(int a){
        if(a%2==0)System.out.println("EVEN");
        else  System.out.println("ODD");
    }
}
