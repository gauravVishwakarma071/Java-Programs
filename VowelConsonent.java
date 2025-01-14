import java.util.*;
public class VowelConsonent{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a word : ");
            String ch = sc.nextLine();

            if (ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' || ch.charAt(0) == 'o' || ch.charAt(0) == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        }


    }
}