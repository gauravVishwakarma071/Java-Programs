import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies any kid currently has
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Create the result list
        List<Boolean> result = new ArrayList<>();

        // Check if each kid can have the greatest number of candies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example Input
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // Example Output
        List<Boolean> output = kidsWithCandies(candies, extraCandies);
        System.out.println(output);
    }
}
