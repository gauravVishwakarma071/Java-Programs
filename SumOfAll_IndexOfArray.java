import java.util.Arrays;
import java.util.*;
public class SumOfAll_IndexOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Taking size of array.
            System.out.print("Enter size of array : ");
            int size = sc.nextInt();
            
            //Array
            int arr[] = new int[size];
            
            //Taking inputs in array.
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter value : ");
                arr[i] = sc.nextInt();
            }

            System.out.println("This is your Array -> " + Arrays.toString(arr));

            runningSum(arr);
        }
    }

    public static void runningSum(int arr[]){

        int sum = 0; 

        //Operations Performed
        for (int i = 0; i < arr.length; i++) {
            sum= sum + arr[i];
            arr[i] = sum;
        }

        //Printing result
        System.out.println("This is your result -> " + Arrays.toString(arr));
    }
}
/*

arr[i] += arr[i-1];

=========================

int sum = 0; 

        //Operations Performed
        for (int i = 0; i < arr.length; i++) {
            sum= sum + arr[i];
            arr[i] = sum;
        }

*/ 