/*
reversing a input string value
 */ 
import java.util.*;
public class String_reverse {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            
            for(int i = name.length()-1; i>=0; i--){
                System.out.print(name.charAt(i));
            }
        }
    }
    
}
