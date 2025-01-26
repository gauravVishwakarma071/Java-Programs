//Inheritance_1 -> basic
class Shape{
    String color;
}
class Triangle extends Shape{

}
public class Inheritance_1{

    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color + " Triangle");
    }
}