import java.util.Scanner;

public class InputTill0ReturnMaxNum {
    public static void main(String[] args) {
        solution();
    }

    public static int solution(){
        try (Scanner sc = new Scanner(System.in)) {
            int max = 0;
            int n;

            while (true) { 
            n = sc.nextInt();
              
            if(max<n){
                n = max;
            }
            if(n==0){
                return max;
            }   
            }
        } 
    }
}
