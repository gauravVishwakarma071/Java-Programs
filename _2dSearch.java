/*
 * Searching an element in 2D array.
 */
import java.util.*;
public class _2dSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            System.out.println("--------------");

            int arr[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("======================");

            System.out.println("NUM>..?");
            int x = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if(arr[i][j] == x)
                     {
                        System.out.println("indices "+i+" "+j );
                    }
                }
            }
            sc.close();
        }


    }
}
