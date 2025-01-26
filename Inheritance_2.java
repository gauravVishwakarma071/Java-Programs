//Ineritance_2
class Shape{
    int l;
    int b;
    int h;
    int a;
}

//Single level
class Triangle extends Shape{
    public void area(int l,int h){
            System.out.println(l*h*0.5);
    }
}

//Multi-leve
class Rectangle extends Shape{
    public void area(int l,int h){
            System.out.println(l*h*0.5);
    }
}

class Square extends Shape{
    public void area(int a){
            System.out.println(4*a);
    }
}
    
    public class Inheritance_2 {
        public static void main(String[] args) {
            // Triangle t1 = new Triangle();
            // t1.area(4, 6);

            Square s1 = new Square();
            s1.area(5);
            

    }
}
