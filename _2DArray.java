import java.util.*;

public class _2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("---------------");
        
        int number[][]=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
