//Wap to find the area of a triangle using class and object.
import java.util.*;

class Triangle{
    int b ;
    int l;

    void area(int b,int c){
        float result = (b*c)/2;
        System.out.print("The Area is : "+result);
    }
}

public class TriangleArea{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            com.inheritence.Triangle t1 = new com.inheritence.Triangle();

            System.out.print("Enter breathe : ");
            t1.b  = sc.nextInt();

            System.out.print("Enter length : ");
            t1.l  = sc.nextInt();

            t1.area(t1.b, t1.l);
        }

    }
}