/*
 * Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
 */
import java.util.*;         
public class Triplet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            System.out.println("Enter 3rd number");
            int c = sc.nextInt();

            if(triplet(a, b, c)==true) System.out.println("YES");
            if(triplet(a, b, c)==false) System.out.println("NO");
        }

    }

    public static boolean  triplet(int a,int b,int c){
        if(a*a+b*b==c*c) return true;
        if(a*a+c*c==b*b) return true;
        if(b*b+c*c==a*a) return true;
       return false;
    }
    
}
