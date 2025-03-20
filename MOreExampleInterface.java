interface GrandFather{
    void canSwim();
}

interface GrandMother{
    void canCook();
}

interface Mother{
    void canSing();
}

interface Father extends GrandFather,GrandMother{
    void canDrive();
}

class Child implements Mother, Father{

    String name;

    Child(String name){
        this.name = name;
    }

    @Override
    public void canDrive() {
       System.out.println("child can drive");
    }

    @Override
    public void canSing() {
        System.out.println("child can sing");
    }

    @Override
    public void canSwim() {
        System.out.println("child can Swim");

    }

    @Override
    public void canCook() {
        System.out.println("child can cook");

    }

}

public class MOreExampleInterface {
    public static void main(String[] args) {
        
        Child rohan = new Child("Rohan");


    }
}
