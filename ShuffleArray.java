//Shuffle the elements of an array.
import java.util.*;
public class ShuffleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int arr[] = new int[4];
        System.out.println("Give inputs in array");

        //Taking inputs in arrays
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter at "+i+" : ");
            arr[i] = sc.nextInt();
        }
        int n = (arr.length) / 2;
        sc.close();
    }
    public static int[] shuffle(int[] arr, int n) {
        //creating an array to store results
        int result[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i*n] = arr[i*n];
        }
        return arr; 
    }
}