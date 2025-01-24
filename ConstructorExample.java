// Demonstrating Default, Parameterized, and Copy Constructors
class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        System.out.println("Default Constructor called!");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String name, int age) {
        System.out.println("Parameterized Constructor called!");
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person other) {
        System.out.println("Copy Constructor called!");
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Person p1 = new Person();
        p1.display();

        // Using Parameterized Constructor
        Person p2 = new Person("Gaurav", 24);
        p2.display();

        // Using Copy Constructor
        Person p3 = new Person(p2);
        p3.display();
    }
}
