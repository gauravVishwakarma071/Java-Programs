interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class Labrador implements Dog {

    @Override
    public void eat() {
        System.out.println("Labrador is eating");
    }

    @Override
    public void bark() {
        System.out.println("Labrador is barking");
    }

}
public class ExtendingInterface {
    public static void main(String[] args) {
        
        Labrador lab = new Labrador();
        lab.bark();
        lab.bark();
    }
}
