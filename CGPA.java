/*
 CGPA = sum of all points of every subject / number of subject  
 */
import java.util.*;
public class CGPA {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            
            System.out.print("Enter masks of Subject 1 : ");
            float s1 = sc.nextFloat();
            System.out.print("Enter masks of Subject 2 : ");
            float s2 = sc.nextFloat();
            System.out.print("Enter masks of Subject 3 : ");
            float s3 = sc.nextFloat();
            System.out.print("Enter masks of Subject 4 : ");
            float s4 = sc.nextFloat();

            float numOfSub = sc.nextInt();
            
            float CGPA = (float) ((s1+s2+s3+s4) / (numOfSub * 9.5));

            System.out.println(CGPA);
    }
}
