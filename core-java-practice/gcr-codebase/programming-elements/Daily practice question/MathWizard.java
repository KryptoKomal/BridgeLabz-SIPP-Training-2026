class MathWizard {

    int instanceVar = 100;

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScope() {
        int localVar = 50;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }
}

public class Main {
    public static void main(String[] args) {
        MathWizard mw = new MathWizard();

        System.out.println("Prime(17): " + mw.isPrime(17));
        System.out.println("Factorial(5): " + mw.factorial(5));
        System.out.println("Factorial(5.0): " + mw.factorial(5.0));
        System.out.println("Fibonacci(7): " + mw.fibonacci(7));
        System.out.println("GCD(24,36): " + mw.gcd(24, 36));
        System.out.println("LCM(24,36): " + mw.lcm(24, 36));
        System.out.println("Power(2,5): " + mw.power(2, 5));

        mw.showScope();
    }
}