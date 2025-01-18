import java.util.Scanner;

public class FindXInAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter : ");
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter Your X : ");
            int x = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==x) System.out.println("At index : " + i);
            }
        }

    }
}
