import java.util.Arrays;

public class SumOfAll_IndexOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0]; // Initialize the first element
        
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i]; // Add the previous running sum to the current element
        }
        
        return result;
    }
}
