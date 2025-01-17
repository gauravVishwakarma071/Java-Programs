public class Shadowing {
    static int x = 90; // static var
    public static void main(String[] args) {
        
        System.out.println(x); // static var
        int x = 40; // local variable which is not related to (static x var).
        System.out.println(x); 
        fun();
    }
    
    static void fun(){
        System.out.println(x);// static var
        x = 100; // static variable modified
        System.out.println(x);
    }
}
