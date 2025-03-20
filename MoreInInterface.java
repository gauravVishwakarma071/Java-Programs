interface Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}

class Developer{
    public void devApp(Computer lab){
        lab.code();
    }
}

public class MoreInInterface {
    public static void main(String[] args) {

        Computer laptop1 = new Laptop();
        Computer desktop1 = new Desktop();

        Developer gaurav = new Developer();
        gaurav.devApp(laptop1);
        gaurav.devApp(desktop1);
    }
}
