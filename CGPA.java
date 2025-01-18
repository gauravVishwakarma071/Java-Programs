/*
 CGPA = sum of all points of every subject / number of subject  
 */
import java.util.*;
public class CGPA {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            
            // Taking Input ( number of subjects) 
            System.out.print("Enter number of subjects : ");
            int sub = sc.nextInt();
            
            //defining an Arrays to store 
            float marks[] = new float[sub];
            
            //A loop for taking inputs of marks and adding them together
            float total = 0;
            for(int i = 0; i < sub ; i++){
                
                System.out.print("Enter mark of subjects "+i+" : ");
                marks[i] = sc.nextInt();

                if(marks[i]<0 || marks[i]>100) {
                    System.out.println("invailid marks");
                    i--;
                }else{
                    total += marks[i]; 
                }
            }

            //Calculating CGPA 
            float CGPA = (float) ((total) / (sub * 9.5f));

            System.out.println("The CGPA : "+CGPA);
    }
}
