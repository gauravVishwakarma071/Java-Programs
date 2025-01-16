import java.util.*;
public class DistanceBTw_TwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Input for the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate the distance using the formula
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Display the result
        System.out.printf("Distance between the points: %.2f", distance);

        sc.close();
    }
}

