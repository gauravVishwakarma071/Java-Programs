//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class akeInputTillZero_2{
    public static void main(String[] args) {
            
        solution();
        
    }

    public static int solution(){
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int n;
            while (true) { 
             n = sc.nextInt();
             sum += n;
              if(n==0){
                System.out.println("The sum of all numbers are : "+sum);
                return sum;
              }   
            }
        } 
    }
}