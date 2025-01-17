public class MethodOverloading {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 30;
        int c = 40;
        
        sum(a,b);
        sum(a,b,c);

    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a ,int b ,int c){
        return a+b+c;
    }
}
