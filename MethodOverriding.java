class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
    }
}