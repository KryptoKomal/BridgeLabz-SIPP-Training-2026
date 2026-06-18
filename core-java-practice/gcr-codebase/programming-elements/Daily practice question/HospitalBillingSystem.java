class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;
            int costPerItem = totalBill / items;
            System.out.println(costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
        }

        try {
            String[] patients = {"Komal", "Rahul", "Aman"};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "ABC";
            int patientId = Integer.parseInt(input);
            System.out.println(patientId);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(5000, 3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital billing system is running safely.");
    }
}