//How Many Numbers Are Smaller Than the Current Number.

import java.util.Arrays;
import java.util.Scanner;
public class SmallerNumsInArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[4];
            System.out.println("Give inputs in array");
            
            //Taking inputs in arrays
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter at "+i+" : ");
                arr[i] = sc.nextInt();
            }

            smallerNumbersThanCurrent(arr);            
        }
    }
    public static void smallerNumbersThanCurrent(int[] arr) {
            //creating an array to store results
            int result[] = new int[arr.length];
            //Calculation part.
            int count;
            for (int i = 0; i < arr.length; i++) {
                count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]>arr[j]){
                        count++;
                    }
                }
                result[i]=count;
            }          
            System.out.println(Arrays.toString(result));
    }
}
