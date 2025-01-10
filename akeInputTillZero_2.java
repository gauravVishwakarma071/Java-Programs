//Input a number and print all the factors of that number (use loops).
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
                return sum;
              }   
            }
        } 
    }
}