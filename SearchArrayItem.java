import java.util.*;

public class SearchArrayItem {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("NUM..?");
       int x = sc.nextInt();

       int [] number = {23,12,43,32,43,1,3,4,44,4,21,98,2,3,4,5,6,7,9,2,3};

       for(int i=0;i<number.length;i++){
            if(x==number[i]) {System.out.println("Index : "+i); }
       }
    }
}
