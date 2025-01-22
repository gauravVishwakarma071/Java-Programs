import java.util.*;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of customers (rows): ");
        int m = sc.nextInt();
        System.out.print("Enter number of banks (columns): ");
        int n = sc.nextInt();

        // Input account balances
        int[][] accounts = new int[m][n];
        System.out.println("Enter account balances:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Customer " + (i + 1) + ", Bank " + (j + 1) + ": ");
                accounts[i][j] = sc.nextInt();
            }
        }

        // Find the richest customer's wealth
        int maxWealth = findRichestCustomerWealth(accounts);

        System.out.println("The richest customer's wealth is: " + maxWealth);
        sc.close();
    }

    public static int findRichestCustomerWealth(int[][] accounts) {
        int maxWealth = 0;

        // Calculate wealth for each customer
        for (int[] customer : accounts) {
            int customerWealth = 0;
            for (int bank : customer) {
                customerWealth += bank;
            }
            // Update max wealth if current customer's wealth is greater
            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }
}
