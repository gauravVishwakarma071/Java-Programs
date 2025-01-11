//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class InputTill0ReturnMaxNum {
    public static void main(String[] args) {
        solution();
        
    }

    public static int solution(){
        try (Scanner sc = new Scanner(System.in)) {
            int max=0;
            int n;

            while (true) { 
            n = sc.nextInt();
              
            if(max<n){
                max = n;
            }
            if(n==0){
                System.out.println("The largest number among them is : "+max);
                return max;
            }   
            }
        } 
    }
}
