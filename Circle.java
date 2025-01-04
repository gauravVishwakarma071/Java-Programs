/*
 * Java Program to Calculate Area and Circumference of Circle.
 * Area of circle = πr^2
Circumference of circle = 2πr
Here π value is 22/7 or 3.14 (rounding of the output of 22/7 upto 2 decimal places).
 */
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the radius");
            float r = sc.nextInt();

            System.out.println("Area = "+area(r));
            System.out.println("circumference = "+circumference(r));

        }

    }
    public static float area(float r){
        float area = (float) (Math.PI * (r * r));
        return area;
    }
    
    public static float circumference(float r){
        float circumference = (float) (2* Math.PI * r);
        return circumference;
    }
}
