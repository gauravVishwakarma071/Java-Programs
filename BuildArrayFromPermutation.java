import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        // Create a new array to store the result
        int[] ans = new int[nums.length];
        
        // Populate the array based on the condition ans[i] = nums[nums[i]]
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }

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

        int[] result = buildArray(arr);
        
        // Output the result
        System.out.println(Arrays.toString(result)); // Output: [0, 1, 2, 4, 5, 3]
        sc.close();
    }//{0, 2, 1, 5, 3, 4}
}
