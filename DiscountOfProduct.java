//Calculate Discount Of Product.
import java.util.*;
public class DiscountOfProduct {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter price");
        int price = sc.nextInt();
        System.out.println("Enter discount percentage");
        int discountP = sc.nextInt();

        float discount = (float) price*discountP / 100;
        System.out.println("The final price : "+ (price-discount));
    }
    }
}
