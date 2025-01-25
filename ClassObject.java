import java.util.*;

public class ClassObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Object of class Rectangle.
        Rectangle r1 = new Rectangle();

        System.out.print("Enter breathe : ");
        r1.breathe = sc.nextInt();
        System.out.print("Enter length : ");
        r1.length = sc.nextInt();

        r1.area();
        r1.parameter();

        sc.close();
    }
}
        
class Rectangle{
    int breathe;
    int length;
        
    void area(){
        System.out.println("The area of rectangle is : "+(breathe*length));
    }
    void parameter(){
        System.out.println("The parameter of rectangle is : "+((breathe+length)*2));
    }
}
