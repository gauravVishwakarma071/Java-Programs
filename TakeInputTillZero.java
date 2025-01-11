//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class TakeInputTillZero{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int n;
            
            System.out.println("Enter numbers");
            while(true){
            n = sc.nextInt();
            sum += n;
              if(n==0){
                System.out.println(sum);
                break;
              }         
            }
        }
    }
}
