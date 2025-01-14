//LCM Of Two Numbers.
import java.util.*;
public class LCM {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int hcf = 0;
            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();

            int min = (num1 < num2) ? num1 : num2;

            for (int i = 1; i <= min; i++) {

                if(num1%i==0 && num2%i==0){
                    hcf = i;
                }

            }
            System.out.println(("LCM : " + (num1*num2)/hcf));
        }

    }
}
