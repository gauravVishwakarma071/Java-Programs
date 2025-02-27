interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {  // Ensure this method is here
        System.out.println("Dog is sleeping");
    }
}

public class InterfaceExample {  // Renamed from 'Interface' to 'InterfaceExample'
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();  // No error should occur now
    }
}
