/*
 * Alpha case checking on words.
 */
import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();

            if(word.charAt(0)>='a' && word.charAt(0)<='z'){
                System.out.println("Lowwer case");
            } else{
                System.out.println("upper case");
            }
        }
    }
}
