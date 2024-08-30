import java.util.*;
//Finding greater number between three numbers.
public class Comparing3NUm {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.println("1st num?");
        int num1 = s.nextInt();
        System.out.println("2nd num?");
        int num2 = s.nextInt();
        System.out.println("3rd num?");
        int num3 = s.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("All number are eqaul!");
        } else if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is greater");
            }else{
                System.out.println(num3+" is greater");

            }

        }else{
            if (num2>num3) {
                System.out.println(num2+" is greater");
            }else{
                System.out.println(num3+" is greater");

            }
        }
    }
}
