import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number...?");
        int n = sc.nextInt();
        revNum(n);
    }

    public static void revNum(int n){
        while(n>0){
            int rem  = n%10;
            System.out.print(rem);
            n/=10;
        }
    }
}
