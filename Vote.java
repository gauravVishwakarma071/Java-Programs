/*
 * A person can votes if age is greater than or equal to 18.
 */
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        eligible(age);
    }

    public static void eligible(int age){
        if(age>=18) System.out.println("You Can Vote");
        else System.out.println("You Can Not Vote");
    }
}
