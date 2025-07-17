package com.inheritence;

//Ineritance_2
class Shape{
    int l;
    int b;
    int h;
    int a;
}

//Single level
class Triangle1 extends Shape{
    public void area(int l,int h){
            System.out.println(l*h*0.5);
    }
}

//Multi-leve
class Rectangle extends com.inheritence.Shape {
    public void area(int l,int h){
            System.out.println(l*h*0.5);
    }
}

class Square extends com.inheritence.Shape {
    public void area(int a){
            System.out.println(4*a);
    }
}
    
    public class Inheritance_2 {
        public static void main(String[] args) {
            // com.inheritence.com.inheritence.Triangle1 t1 = new com.inheritence.com.inheritence.Triangle1();
            // t1.area(4, 6);

            Square s1 = new Square();
            s1.area(5);
            

    }
}
