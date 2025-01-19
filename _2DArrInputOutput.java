//Taking input and printing output of 2D array.
import java.util.*;
public class _2DArrInputOutput {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter row : ");
        int col = sc.nextInt();
        
        int arr[][] = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("Enter at " +"|"+i+"-"+j+"| : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("=========================================");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
