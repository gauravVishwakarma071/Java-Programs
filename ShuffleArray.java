//Shuffle the elements of an array.
import java.util.*;
public class ShuffleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give inputs in array");

        //Taking inputs in arrays
        for (int i = 0; i < n; i++) {
            System.out.print("Enter at "+i+" : ");
            arr[i] = sc.nextInt();
        }
        shuffle(arr, n/2);
        sc.close();
    }
    public static void shuffle(int[] arr, int n) {
        //creating an array to store results
        int index = 0;
        int result[] = new int[arr.length];
        for (int i = 0; i < n; i++) {
            result[index++] = arr[i];
            result[index++] = arr[i+n];
        }
        System.out.println(Arrays.toString(result)); 
    }
}//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]