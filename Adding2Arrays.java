import java.util.*;
public class Adding2Arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter inputs in first Array");
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter col : ");
        int col = sc.nextInt();

        
        
        int arr[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int result[][] = new int[row][col];
        
        //Taking inputs in First arr
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("Enter at " +"|"+i+""+j+"| : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("----------------------------------------");
        
        System.out.println("Enter inputs in second Array");
        
        //Taking inputs in First arr
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("Enter at " +"|"+i+""+j+"| : ");
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


        //Adding both arrys 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j]  = arr[i][j] + arr2[i][j];
            }
            System.out.println();
        }

        //Print result array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
