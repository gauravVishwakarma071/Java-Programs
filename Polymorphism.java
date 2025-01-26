//Polymorphism means many-forms. We can write many function with name but different functionalities.    
class Polymorphism {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int min(int a, int b){
        return a-b;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int c = 8;

        System.out.println(min(a,b));
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }    
}