class Outer{
    static class Inner{
        static void display(){
            System.out.println("Inner : Static");
        }
        void show(){
            System.out.println("Inner : Method");
        }
    }
}
public class Static_4 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();

        Outer.Inner.display();
    }
}
