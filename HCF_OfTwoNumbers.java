/*Calculating HCF of between two number.
Example 1:
Input: 12 and 18
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
Common Factors: 1, 2, 3, 6
HCF: 6 (largest common factor)
*/

import java.util.*;
public class HCF_OfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int con = (num1 > num2) ? num1 : num2;

        for (int i = 1; i <= con; i++) {

            if(num1%i==0 && num2%i==0){
                max = i;
            }

        }
        System.out.print("HCF : "+max);

    }
}
