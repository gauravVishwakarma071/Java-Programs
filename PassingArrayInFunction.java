import java.util.Arrays;

public class PassingArrayInFunction {
    public static void main(String[] args) {
        
        int [] arr = {2,54,64,3,2,8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[1] = 7;
    }
}
