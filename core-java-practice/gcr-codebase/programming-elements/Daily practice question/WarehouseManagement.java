import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {

        int[] stock = {50, 20, 30, 40, 20, 60, 70, 30};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        // Find max, min, total
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > max) {
                max = stock[i];
            }

            if (stock[i] < min) {
                min = stock[i];
            }

            total += stock[i];
        }

        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        // Detect duplicates
        System.out.println("\nDuplicate Quantities:");
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    break;
                }
            }
        }

        // Rotate array by k positions
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter value of k: ");
        int k = sc.nextInt();

        k = k % stock.length;

        int[] rotated = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotated[(i + k) % stock.length] = stock[i];
        }

        System.out.println("\nRotated Array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\nOriginal Shelf Grid:");
        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose
        System.out.println("\nTransposed Shelf Grid:");
        for (int i = 0; i < shelf[0].length; i++) {
            for (int j = 0; j < shelf.length; j++) {
                System.out.print(shelf[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}