import java.util.Scanner;

public class NumberOfSteps {

    public static int numberOfSteps(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int nos) {
        if (n == 0) {
            return nos;
        }

        if (n % 2 == 0) {
            return helper(n / 2, nos + 1);
        } else {
            return helper(n - 1, nos + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of Steps: " + numberOfSteps(n));

        sc.close();
    }
}