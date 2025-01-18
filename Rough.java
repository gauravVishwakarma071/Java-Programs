import java.util.*;
public class Rough {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of subjects : ");
            int sub = sc.nextInt();
                
            //defining an Arrays to store 
            float marks[] = new float[sub];
                
            float total = 0;
            for(int i = 0; i < sub ; i++){
                
                System.out.print("Enter mark of subjects "+i);
                marks[i] = sc.nextInt();
                total += marks[i]; 
            }

            System.out.println(total);
        }
    }
}
