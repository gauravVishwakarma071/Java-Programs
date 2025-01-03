/*
 * Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 */
import java.util.*;
public class GreatestIN {
    public static void main(String[] args) {    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            System.out.println("Enter 3rd number");
            int c = sc.nextInt();

            System.out.println("The maximum number is : "+greatest(a, b, c));
        }
       
    }

    public static int greatest(int a,int b,int c){

        int max = 0;

        if(max<a) max = a;
        if(max<b) max = b;
        if(max<c) max = c;

        return max;
    }

}

