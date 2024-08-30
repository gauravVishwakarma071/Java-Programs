import java.util.*;
// reversing an array
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        System.out.println("-------------");
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
            System.out.println("-------------");
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        sc.close();
    }
    
}
