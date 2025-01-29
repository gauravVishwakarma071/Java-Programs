import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KidsWithCandie_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Boys : ");
        int boys = sc.nextInt();
        System.out.print("Enter Extra-candies : ");
        int extraC = sc.nextInt();
        int[] candies = new int[boys];
        System.out.println("Enter number of candies.");

        //Taking inputs in array
        int max = 0;
        for (int i = 0; i < boys; i++) {
            System.out.print(i + "_boy : ");
            candies[i] = sc.nextInt();
            if(max<candies[i]){
                max = candies[i];//Storing maximum number of candies, having a single boys. 
            }
        }



        //Create a list to store result.
        List<Boolean> output = new ArrayList<>();

        for (int i = 0; i < boys; i++) {
            if(max<=(candies[i]+extraC)) output.add(true);
            else output.add(false);
        }

        // Printing the result
        System.out.println(output);

        sc.close();
    }
}
