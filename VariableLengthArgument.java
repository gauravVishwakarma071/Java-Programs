import java.util.Arrays;

public class VariableLengthArgument {
    public static void main(String[] args) {
        
        fun(4,6,2,4,6,3,2);
        
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
