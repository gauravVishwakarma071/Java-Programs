class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void display() {  // This is method hiding, not overriding
        System.out.println("Child static method");
    }
}

public class Static_5 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display();  // Parent static method

        Child obj2 = new Child();
        obj2.display();  // Child static method

        Parent obj3 = new Child();
        obj3.display();  // Parent static method (Method Hiding)
    }
}

