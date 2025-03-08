class Parent{
    static final int MONEY = 234332; // Final -> constant varial
    int pocketMOney;
    final void show(){   //final method that can't be inherited by others
        System.out.println();
    }
}
    
class Child extends Parent{
   
}

public class FinalEX{
    public static void main(String[] args) {      
       System.out.println(Parent.MONEY);
       Child c1 = new Child();
       c1.pocketMOney = 500;
    }
}