class Parent{
    static final int MONEY = 234332; // Final -> constant varial
    final int pocketMoney = 200;
    
    final void show(){   //final method that can't be inherited by others
        System.out.println(pocketMoney);
    }
}
    
class Child extends Parent{
   
}

public class FinalEX{
    public static void main(String[] args) {      
       System.out.println(Parent.MONEY);
       Child c1 = new Child();
       //c1.pocketMoney = 500; can't be reassign
       //Parent.show();
       c1.show();
        System.out.println(c1.pocketMoney);
    }
}