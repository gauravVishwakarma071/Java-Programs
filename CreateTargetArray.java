//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        
        // Insert elements from nums into target at the specified index
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        
        // Convert the target list to an array and return
        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        
        int[] targetArray = createTargetArray(nums, index);
        
        // Print the result
        for (int num : targetArray) {
            System.out.print(num + " ");
        }
    }
}
